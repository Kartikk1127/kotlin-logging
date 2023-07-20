package com.kartikey.controller

import com.kartikey.service.YourService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log

@RestController
@RequestMapping("/calculate")
class HelloController(private val service: YourService) {

//    val logger = LoggerFactory.getLogger(this::class.java)
//
//    @GetMapping("/hello")
//    fun hello(): String{
//        logger.trace("TRACE line")
//        logger.debug("DEBUG line")
//        logger.info("INFO line")
//        logger.warn("WARN line")
//        logger.error("ERROR line")
//
//        logger.info("Info {} {} ", 1, "abc")
//        try{
//            val x = 1/0
//        }catch (e: Throwable){
//            logger.error("ERR failed to compute x", e)
//        }
//        return "hello"
//    }

    @GetMapping("/add")
    fun addNumbers(@RequestParam("a") a: Int, @RequestParam("b") b: Int): Int {
        return service.add(a, b)
    }

    @GetMapping("/subtract")
    fun subtractNumbers(@RequestParam("a") a: Int, @RequestParam("b") b: Int): Int {
        return service.subtract(a, b)
    }
}
