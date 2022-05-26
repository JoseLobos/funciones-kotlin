package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHolaMundo.text = "¡Bienvenidos al curso de Android con Kotlin";
        btEjecutar.setOnClickListener{
            // Ejemplo de asiganción de valor a una vista
            tvCadena.text = "Tu nombre es: Juan Perez"

            Toast.makeText(this,"Has cambiado el texto",Toast.LENGTH_LONG).show()
        }
    }
}