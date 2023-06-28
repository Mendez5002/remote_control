package com.example.remote_control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class spscreenactivity : AppCompatActivity() {
     lateinit var Spscreen:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spscreen)

        Spscreen= findViewById(R.id.spscreen)

        val intent = Intent(this,spscreenactivity::class.java)
        startActivity(intent)



    }
}