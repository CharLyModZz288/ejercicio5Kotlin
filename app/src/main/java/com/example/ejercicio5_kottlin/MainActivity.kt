package com.example.ejercicio5_kottlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var container: RelativeLayout
    lateinit var editTextMensaje: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMensaje = findViewById(R.id.editTextMensaje)


    }
    fun cambiarColorFondo(view: View) {
        container.setBackgroundColor(Color.BLUE)
    }
    fun abrirActividad2(view: View) {
        val mensaje = editTextMensaje.text.toString() // Obtenemos el texto del EditText
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra("mensaje", mensaje) // Enviamos el mensaje como extra en la Intent
        startActivity(intent)
    }
}
