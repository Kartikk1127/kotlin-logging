package com.kartikey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class KotlinLoggingApplication

fun main(args: Array<String>) {
	runApplication<KotlinLoggingApplication>(*args)
}
