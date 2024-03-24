package com.example.intentlecturedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //

        val button = findViewById<Button>(R.id.btnNext)
        val textField = findViewById<EditText>(R.id.etName)

        button.setOnClickListener {

            val i = Intent(this@MainActivity, SecondActivity::class.java)
            i.putExtra("userInput1", textField.text.toString())
            startActivity(i)

        }

    }
}