package com.example.group1FirebaseProject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Profile : AppCompatActivity() {
    private lateinit var logoutButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        logoutButton = findViewById(R.id.log_out)

        clickListener()
    }
    private fun clickListener() {
        logoutButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}