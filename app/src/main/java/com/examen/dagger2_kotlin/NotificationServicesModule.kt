package com.examen.dagger2_kotlin

import dagger.Module
import dagger.Provides
// provider - producer provide the dependency object to consumer through component
@Module()
class NotificationServicesModule {

    @Provides
    fun provideEmailService ():NotificationServices{
        return  EmailService()
    }

    @MessageQualifier
    @Provides
    fun provideMessageServies(): NotificationServices{
        return MessageService()
    }
    // @MessageQualifier In Dagger 2, the @Qualifier annotation is used to solve the problem of binding ambiguity or duplicate binding.
    /*When you have multiple modules that provide instances of the same type, Dagger 2 may encounter a situation where it doesn't know which instance to use. This is known as a binding ambiguity or duplicate binding problem.*/
}