package org.vv.cryptoactivitytracker.customerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerApiApplication

fun main(args: Array<String>) {
	runApplication<CustomerApiApplication>(*args)
}
