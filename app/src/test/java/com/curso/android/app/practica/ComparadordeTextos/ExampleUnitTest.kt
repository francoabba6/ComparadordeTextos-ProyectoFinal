package com.curso.android.app.practica.ComparadordeTextos

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

private fun compararinputs(text1: String, text2: String): String {
    return if (text1 == text2) {
        "Los caracteres son iguales."
    } else {
        "Los caracteres son diferentes."
    }
}

class CompararInputsTest {

    @Test
    fun compararinputs_textosIguales() {

        val input1 = "hola"
        val input2 = "hola"
        val expectedResultado = "Los caracteres son iguales."

        val resultado = compararinputs(input1, input2)

        assertEquals(expectedResultado, resultado)
    }

    @Test
    fun compararinputs_textosDiferentes() {

        val input1Text = "hola"
        val input2Text = "chau"
        val expectedResultado = "Los caracteres son diferentes."

        val resultado = compararinputs(input1Text, input2Text)

        assertEquals(expectedResultado, resultado)
    }
}