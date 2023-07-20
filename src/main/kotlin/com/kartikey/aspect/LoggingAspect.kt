package com.kartikey.aspect

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Before("execution(* com.kartikey.service.YourService.*(..))")
    fun beforeAdvice(){
        println("Before method execution")
    }

    @AfterReturning(pointcut = "execution(* com.kartikey.service.YourService.*(..))", returning = "result")
    fun afterReturningAdvice(result: Any){
        println("After method execution, Result: $result")
    }

    @After("execution(* com.kartikey.service.YourService.*(..))")
    fun afterAdvice(){
        println("After method execution (regardless of success or exception)")
    }

//    aroundAdvice method provides full control over the target method's execution, allowing you to perform
//    actions before and after the method execution and handle any exceptions that might occur during the process.
    @Around("execution(* com.kartikey.service.YourService.*(..))")
    fun aroundAdvice(joinPoint: ProceedingJoinPoint): Any? {
        println("Before method execution")
        val result: Any?
        try {
            result = joinPoint.proceed()
        } catch (ex: Exception) {
            println("Exception occurred: ${ex.message}")
            throw ex // Rethrow the exception if needed
        }
        println("After method execution, Result: $result")
        return result
    }

    @AfterThrowing(pointcut = "execution(* com.kartikey.service.YourService.*(..))", throwing = "ex")
    fun afterThrowingAdvice(ex: Exception){
        println("Exception occurred: ${ex.message}")
    }


}
