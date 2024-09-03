package com.examen.kotlinsample

class UserRegistrationService (private val userRepository:UserRepository, private  val emailService:EmailService){

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.sent(email,"sainath@gmail.com","Hello")
    }
}