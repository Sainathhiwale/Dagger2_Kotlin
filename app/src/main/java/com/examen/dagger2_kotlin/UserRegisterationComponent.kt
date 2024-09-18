package com.examen.dagger2_kotlin

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServicesModule::class, UserRepositoryModule::class])
interface UserRegisterationComponent {

   // consumer
    fun injectMainActivity(activity: MainActivity)

    //
    @Component.Factory
    interface Factory{
        fun create( @BindsInstance retryCount:Int): UserRegisterationComponent
    }

}