package com.example.loginapp22oct21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.loginButton)
        val userName = findViewById<EditText>(R.id.editText1)

        login.setOnClickListener {
           if(userName.text.toString().equals("Naseeba")) {
               goToActivityTwo()
           }
            else
            Toast.makeText(this,"Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
    private fun goToActivityTwo(){
        startActivity(Intent(this, ActivityTwo::class.java))
        finish()
    }
}