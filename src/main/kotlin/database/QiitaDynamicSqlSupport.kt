/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.sample_qiita.database

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object QiitaDynamicSqlSupport {
    object Qiita : SqlTable("qiita") {
        val id = column<Long>("id", JDBCType.BIGINT)

        val content = column<String>("content", JDBCType.VARCHAR)

        val title = column<String>("title", JDBCType.VARCHAR)
    }
}