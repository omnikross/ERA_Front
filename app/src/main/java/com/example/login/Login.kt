package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun registerScreen(view: View){
        val registerIntent = Intent(this, Register::class.java)
        startActivity(registerIntent)
    }
    fun mainScreen(view: View){
        val mainIntent = Intent(this, MainScreen::class.java)
        startActivity(mainIntent)
    }
    fun verifyScreen(view: View){
        val verifyIntent = Intent(this, Verify::class.java)
        startActivity(verifyIntent)
    }
}