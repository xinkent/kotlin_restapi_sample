/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.sample_qiita.database

import com.example.sample_qiita.database.QiitaDynamicSqlSupport.Qiita
import com.example.sample_qiita.database.QiitaDynamicSqlSupport.Qiita.content
import com.example.sample_qiita.database.QiitaDynamicSqlSupport.Qiita.id
import com.example.sample_qiita.database.QiitaDynamicSqlSupport.Qiita.title
import com.example.sample_qiita.database.QiitaRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun QiitaMapper.count(completer: CountCompleter) =
    countFrom(this::count, Qiita, completer)

fun QiitaMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Qiita, completer)

fun QiitaMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where(id, isEqualTo(id_))
    }

fun QiitaMapper.insert(record: QiitaRecord) =
    insert(this::insert, record, Qiita) {
        map(id).toProperty("id")
        map(content).toProperty("content")
        map(title).toProperty("title")
    }

fun QiitaMapper.insertMultiple(records: Collection<QiitaRecord>) =
    insertMultiple(this::insertMultiple, records, Qiita) {
        map(id).toProperty("id")
        map(content).toProperty("content")
        map(title).toProperty("title")
    }

fun QiitaMapper.insertMultiple(vararg records: QiitaRecord) =
    insertMultiple(records.toList())

fun QiitaMapper.insertSelective(record: QiitaRecord) =
    insert(this::insert, record, Qiita) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(content).toPropertyWhenPresent("content", record::content)
        map(title).toPropertyWhenPresent("title", record::title)
    }

private val columnList = listOf(id, content, title)

fun QiitaMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Qiita, completer)

fun QiitaMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Qiita, completer)

fun QiitaMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Qiita, completer)

fun QiitaMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun QiitaMapper.update(completer: UpdateCompleter) =
    update(this::update, Qiita, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: QiitaRecord) =
    apply {
        set(id).equalTo(record::id)
        set(content).equalTo(record::content)
        set(title).equalTo(record::title)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: QiitaRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(content).equalToWhenPresent(record::content)
        set(title).equalToWhenPresent(record::title)
    }

fun QiitaMapper.updateByPrimaryKey(record: QiitaRecord) =
    update {
        set(content).equalTo(record::content)
        set(title).equalTo(record::title)
        where(id, isEqualTo(record::id))
    }

fun QiitaMapper.updateByPrimaryKeySelective(record: QiitaRecord) =
    update {
        set(content).equalToWhenPresent(record::content)
        set(title).equalToWhenPresent(record::title)
        where(id, isEqualTo(record::id))
    }