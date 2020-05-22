package br.com.rmd.livraria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LivrariaApplication

fun main(args: Array<String>) {
	runApplication<LivrariaApplication>(*args)
}
