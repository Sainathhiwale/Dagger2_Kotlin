package com.examen.dagger2_kotlin

import dagger.Component

@Component
interface UserRegisterationComponent {

    fun getUserRegisterationService():UserRegistrationService

    fun getEmailService(): EmailService

}