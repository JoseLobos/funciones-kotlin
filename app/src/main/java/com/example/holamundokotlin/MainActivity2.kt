package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity(), TextWatcher {


    private var eNombre: EditText? = null
    private var eEdad: EditText? = null
    private var textNombre: TextView? = null
    private var textEdad: TextView? = null
    private var nombre: String? = null
    private var edad = 0
    private var miEdad: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        eNombre = findViewById(R.id.etNombre) as EditText
        eEdad = findViewById(R.id.etEdad) as EditText
        textNombre = findViewById(R.id.tvMostrarNombre) as TextView
        textEdad = findViewById(R.id.etEdad) as TextView
        eNombre?.addTextChangedListener(this)
        eEdad!!.addTextChangedListener(this)
        btEjecutarEstado.setOnClickListener(){
            nombre = eNombre?.text.toString()
            edad = Integer.valueOf(eEdad?.text.toString())
            if(edad < 18)
                tvDatosIngresados.text = "Eres menor de edad"
            else
                tvDatosIngresados.text = "Eres mayor de edad"
            //Toast.makeText(this,nombre,Toast.LENGTH_LONG).show()
        }
    }

    override fun afterTextChanged(p0: Editable?) {

    }
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        nombre = eNombre?.text.toString()

        miEdad = eEdad?.text.toString()
        if(nombre !="")tvMostrarNombre?.text = nombre
        if(miEdad !="")tvMostrarEdad?.text = miEdad
        //textEdad?.text = edad
        //Toast.makeText(this,p0.toString(),Toast.LENGTH_LONG).show()
    }
}