package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val nextpgbtn = findViewById<TextView>(R.id.nextpgbtn)
        val signup = findViewById<TextView>(R.id.signup)

        findViewById<com.google.android.material.button.MaterialButton>(R.id.nextpgbtn).setOnClickListener {
            var username = username.text.toString()
            var password = password.text.toString()
            if (username == null) {
                Toast.makeText(this, "Please, enter your Usernaame", Toast.LENGTH_SHORT).show()
            }   else if (password == null) {
                Toast.makeText(this, "Please, enter your Password", Toast.LENGTH_SHORT).show()
            } else {
                signup.setTextColor(getColor(R.color.black))
            }
    }
}