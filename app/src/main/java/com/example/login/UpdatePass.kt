package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UpdatePass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_pass)
    }
    fun verifyScreen(view: View){
        val verifyIntent = Intent(this, Verify::class.java)
        startActivity(verifyIntent)
    }
    fun verifyGoScreen(view: View){
        val verifyGoIntent = Intent(this, VerifyLetsGo::class.java)
        startActivity(verifyGoIntent)
    }
}