package com.examen.dagger2_kotlin

import dagger.Component

@Component
interface UserRegisterationComponent {

   // consumer
    fun injectMainActivity(activity: MainActivity)

}