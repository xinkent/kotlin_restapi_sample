package com.example.sample_qiita.controller

import com.example.sample_qiita.database.QiitaDynamicSqlSupport.Qiita
import com.example.sample_qiita.database.QiitaMapper
import com.example.sample_qiita.database.QiitaRecord
import com.example.sample_qiita.database.selectByPrimaryKey
import com.example.sample_qiita.database.insert
import com.example.sample_qiita.database.select
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.mybatis.dynamic.sql.SqlBuilder.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*


import javax.validation.Valid

@RestController
@RequestMapping("/api")
class QiitaController(private val qiitaMapper: QiitaMapper) {

    @GetMapping("/qiitas")
    fun getAllQiitas(): List<QiitaRecord> {
        print("debug at get all qiitas")
//        val selectStatement = select(Qiita.id, Qiita.content){from(qiita)}
        // select区内に何か書かないといけない
        return qiitaMapper.select{where(Qiita.id, isGreaterThan(0))}
    }

    @GetMapping("/qiitas/{id}")
    fun getQiitaById(@PathVariable(value = "id") qiitaid: Long): QiitaRecord? {
        return qiitaMapper.selectByPrimaryKey(qiitaid)
    }

    @PostMapping("/qiitas")
    fun createNewQiita(@RequestBody request: InsertRequest): InsertResponse {
        val record = QiitaRecord(request.id, request.content, request.title)
        return InsertResponse(qiitaMapper.insert(record))
    }
//
//

//    @PutMapping("/qiitas/{id}")
//    fun updateQiitaById(@PathVariable(value = "id") qiitaed: Long,
//                        @Valid @RequestBody newQiita: Qiita): ResponseEntity<Qiita> {
//
//        return qiitaRepository.findById(qiitaed).map { existingQiita ->
//            val updateQiita: Qiita = existingQiita
//                    .copy(title = newQiita.title, content = newQiita.content)
//            ResponseEntity.ok().body(qiitaRepository.save(updateQiita))
//        }.orElse(ResponseEntity.notFound().build())
//
//    }
//
//    @DeleteMapping("/qiitas/{id}")
//    fun deleteQiitaById(@PathVariable(value = "id") qiitaed: Long): ResponseEntity<Void> {
//
//        return qiitaRepository.findById(qiitaed).map { qiita ->
//            qiitaRepository.delete(qiita)
//            ResponseEntity<Void>(HttpStatus.OK)
//        }.orElse(ResponseEntity.notFound().build())
//    }
}

data class InsertRequest(val id: Long, val content: String, val title: String)
data class InsertResponse(val count: Int)