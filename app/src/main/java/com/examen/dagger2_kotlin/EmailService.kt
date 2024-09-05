package com.examen.dagger2_kotlin

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun sent(to:String,from:String,body:String){
        Log.d("EmailService", "sent: ")
    }
}