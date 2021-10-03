package com.example.sample_qiita

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleQiitaApplication

fun main(args: Array<String>) {
	print("[debug] application started")
	runApplication<SampleQiitaApplication>(*args)
}
