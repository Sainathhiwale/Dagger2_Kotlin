package com.examen.dagger2_kotlin

import javax.inject.Inject
import javax.inject.Named


class UserRegistrationService @Inject constructor(
   @Named("SQLRepository") private val userRepository:UserRepository,
    private  val notificationServices: NotificationServices
  ) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationServices.sent(email,"sainath@gmail.com","Hello")
    }
}