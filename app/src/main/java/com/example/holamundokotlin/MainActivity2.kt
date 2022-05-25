package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity(), TextWatcher {

    // crear objetos de tipo EditText para enlace con las vistas
    private var eNombre: EditText? = null
    private var eEdad: EditText? = null
    // crear variables para recibir los datos y procesarlos
    private var nombre: String? = null
    private var etEdad = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        eNombre = findViewById(R.id.etNombre) as EditText
        eEdad = findViewById(R.id.etEdad) as EditText
        // Asignar los valores de la vista al objeto de esta clase.
        eNombre?.addTextChangedListener(this)
    }

    override fun afterTextChanged(p0: Editable?) {
        TODO("Not yet implemented")
    }
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }
    // Esta función se ejecutan en el momento de ingresar un dato
    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        Toast.makeText(this,p0.toString(), Toast.LENGTH_LONG).show()
    }
}