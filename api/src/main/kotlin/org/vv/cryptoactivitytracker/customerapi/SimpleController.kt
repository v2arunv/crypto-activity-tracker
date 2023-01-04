package org.vv.cryptoactivitytracker.customerapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/")
    fun sayHello(): String {
        return "Hello there"
    }
}