package com.examen.dagger2_kotlin

import dagger.Component

@Component(modules = [NotificationServicesModule::class, UserRepositoryModule::class])
interface UserRegisterationComponent {

   // consumer
    fun injectMainActivity(activity: MainActivity)

}