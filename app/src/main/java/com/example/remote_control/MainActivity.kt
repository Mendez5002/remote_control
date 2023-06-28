package com.example.remote_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var Left1: Button
    lateinit var Left2:Button
    lateinit var Left3:Button

    lateinit var right1:Button
    lateinit var right2:Button
    lateinit var right3:Button

    lateinit var Foward:Button
    lateinit var Backward:Button
    lateinit var Stop:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Left1=findViewById(R.id.left1)
        Left2=findViewById(R.id.left2)
        Left3=findViewById(R.id.left3)

        right1=findViewById(R.id.right1)
        right2=findViewById(R.id.right2)
        right3=findViewById(R.id.right3)

        Foward=findViewById(R.id.Foward)
        Backward=findViewById(R.id.Backwards)
        Stop=findViewById(R.id.stop)



    }
} 