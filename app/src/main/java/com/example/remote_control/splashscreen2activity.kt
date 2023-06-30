 package com.example.remote_control

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

 @Suppress("DEPRECATION")
 class splashscreen2activity : AppCompatActivity() {
    private val SPLASH_SCREEN = 5000

    private lateinit var topanimation: Animation
    private lateinit var bottomanimation: Animation
    private lateinit var welcome: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen2activity)

        val actionBar= supportActionBar
        actionBar!!.hide()


        topanimation= AnimationUtils.loadAnimation(this,R.anim.topanimation)
        bottomanimation= AnimationUtils.loadAnimation(this,R.anim.bottomanimation)
        welcome=findViewById(R.id.Welcome)

        welcome.animation=topanimation

        Handler().postDelayed({
            val intent= Intent(this,signup ::class.java)
            startActivity(intent)

        }, SPLASH_SCREEN.toLong())

    }
    }
