package com.example.greet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreetApplication

fun main(args: Array<String>) {
	runApplication<GreetApplication>(*args)
}
