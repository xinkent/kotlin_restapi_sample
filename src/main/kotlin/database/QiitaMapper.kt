/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.sample_qiita.database

import com.example.sample_qiita.database.QiitaRecord
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.builder.annotation.ProviderMethodResolver
import org.apache.ibatis.jdbc.SQL
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface QiitaMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<QiitaRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<QiitaRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("QiitaRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): QiitaRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="QiitaRecordResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        Result(column="title", property="title", jdbcType=JdbcType.VARCHAR)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<QiitaRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int

//    // 自作したメソッド
//    @SelectProvider(QiitaMapper.QiitaSqlProvider::class)
//    fun selectAll(): List<QiitaRecord>
//
//    // SQL定義
//    class QiitaSqlProvider: ProviderMethodResolver {
//        companion object {
//            @JvmStatic
//            fun selectAll(): SQL {
//                return SQL().SELECT("id, content, title").FROM("qiita")
//            }
//        }
//    }
}