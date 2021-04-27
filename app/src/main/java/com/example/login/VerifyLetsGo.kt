package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VerifyLetsGo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_lets_go)
    }
    fun mainScreen(view: View){
        val mainIntent = Intent(this, MainScreen::class.java)
        startActivity(mainIntent)
    }
}