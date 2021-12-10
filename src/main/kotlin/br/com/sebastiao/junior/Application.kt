package br.com.sebastiao.junior

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.sebastiao.junior")
		.start()
}

