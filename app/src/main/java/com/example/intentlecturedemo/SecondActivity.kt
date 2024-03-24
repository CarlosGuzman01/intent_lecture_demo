package com.example.intentlecturedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userExtra = intent.getStringExtra("userInput1")


        val text = findViewById<TextView>(R.id.tvResult)

        text.text = userExtra


    }
}