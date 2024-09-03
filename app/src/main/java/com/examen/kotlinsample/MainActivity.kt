package com.examen.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.examen.kotlinsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val emailService: EmailService = EmailService()
        val userRepository: UserRepository = UserRepository()
        val userRegistrationService: UserRegistrationService = UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("sai@gmail.com","password")
    }




}