package com.example.group1FirebaseProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class UpdatePassword : AppCompatActivity() {
    private lateinit var newPas: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_password)
        newPas = findViewById(R.id.new_password)
        updatePassword()
    }
    private fun updatePassword() {
        val user = FirebaseAuth.getInstance().currentUser

        user!!.updatePassword(newPas.toString().trim()).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                println("Update Success")
            } else {
                println("Erorr Update")
            }
        }
    }
}