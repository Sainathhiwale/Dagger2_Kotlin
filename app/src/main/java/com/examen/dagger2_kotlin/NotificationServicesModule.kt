package com.examen.dagger2_kotlin

import dagger.Module
import dagger.Provides

@Module()
class NotificationServicesModule {

    @Provides
    fun provideEmailService ():NotificationServices{
        return  EmailService()
    }
}