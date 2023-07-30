package com.curso.android.app.practica.ComparadordeTextos

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var btnComparar: Button
    private lateinit var lblResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        btnComparar = findViewById(R.id.buttoncomparar)
        lblResultado = findViewById(R.id.lblresultado)

        btnComparar.setOnClickListener {
            compararinputs()
        }
    }
    private fun compararinputs() {
        val text1 = input1.text.toString()
        val text2 = input2.text.toString()

        if (text1 == text2) {
            lblResultado.text = "Los caracteres son iguales."
        } else {
            lblResultado.text = "Los caracteres son diferentes."
        }
    }
}
