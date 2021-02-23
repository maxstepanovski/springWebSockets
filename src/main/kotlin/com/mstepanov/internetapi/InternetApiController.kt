package com.mstepanov.internetapi

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InternetApiController {
    private val logger = LoggerFactory.getLogger(InternetApiController::class.java)

    @GetMapping("/example")
    fun example(): String {
        logger.debug("example")
        return "hello there!"
    }
}