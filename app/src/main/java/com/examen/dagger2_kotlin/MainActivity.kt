package com.examen.dagger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examen.dagger2_kotlin.databinding.ActivityMainBinding

// manual dependency injection
class MainActivity : AppCompatActivity() {
     val component = DaggerUserRegisterationComponent.builder().build()
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val userRegistrationService = component.getUserRegisterationService()
        userRegistrationService.registerUser("dummy@gmail.com","123456")
        val emailService = component.getEmailService()
         emailService.sent("john@gmail.com", "dummy@gmail.com","dummy")
    }
}