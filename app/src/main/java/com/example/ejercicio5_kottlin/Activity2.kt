package com.example.ejercicio5_kottlin

import android.graphics.Typeface
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val mensaje = intent.getStringExtra("mensaje")
        val welcomeTextView = findViewById<TextView>(R.id.textViewBienvenido)
        welcomeTextView.text = "BIENVENIDO A LA APP"
        //val messageTextView = findViewById<TextView>(R.id.messageTextView)
        //messageTextView.text = mensaje

        welcomeTextView.setTypeface(Typeface.create("sans-serif-comic", Typeface.NORMAL))
        welcomeTextView.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        welcomeTextView.textSize = 20f
    }
}

