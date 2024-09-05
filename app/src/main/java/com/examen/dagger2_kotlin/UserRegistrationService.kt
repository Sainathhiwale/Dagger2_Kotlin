package com.examen.dagger2_kotlin

import javax.inject.Inject


class UserRegistrationService @Inject constructor(private val userRepository:UserRepository,
                                                  private  val emailService:EmailService){

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.sent(email,"sainath@gmail.com","Hello")
    }
}