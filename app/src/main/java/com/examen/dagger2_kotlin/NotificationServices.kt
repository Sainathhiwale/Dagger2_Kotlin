package com.examen.dagger2_kotlin

import android.util.Log
import javax.inject.Inject

interface NotificationServices {
    fun sent(to:String,from:String,body:String)
}

class EmailService @Inject constructor(): NotificationServices{
    override fun sent(to: String, from: String, body: String) {
        Log.d("EmailService", "sent: ")
    }
}

class MessageService @Inject constructor(): NotificationServices{
    override fun sent(to: String, from: String, body: String) {
        Log.d("MessageService", "sent: ")
    }

}