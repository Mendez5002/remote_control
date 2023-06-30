package com.example.remote_control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signup : AppCompatActivity() {
     lateinit var Spscreen:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        Spscreen= findViewById(R.id.signup)

        val intent = Intent(this,signup::class.java)
        startActivity(intent)



    }
}