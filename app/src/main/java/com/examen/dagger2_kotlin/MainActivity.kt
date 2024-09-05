package com.examen.dagger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examen.dagger2_kotlin.databinding.ActivityMainBinding


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