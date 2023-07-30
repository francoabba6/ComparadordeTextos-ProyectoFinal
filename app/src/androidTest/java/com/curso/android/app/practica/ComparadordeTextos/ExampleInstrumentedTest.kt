package com.curso.android.app.practica.ComparadordeTextos

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.core.app.ActivityScenario

import org.junit.Test
import org.junit.runner.RunWith
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @Test
    fun testButtonComparar() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        activityScenario.onActivity { activity ->

            val input1 = activity.findViewById<EditText>(R.id.input1)
            val input2 = activity.findViewById<EditText>(R.id.input2)
            val btnComparar = activity.findViewById<Button>(R.id.buttoncomparar)
            val lblResultado = activity.findViewById<TextView>(R.id.lblresultado)

            activity.runOnUiThread {
                input1.setText("hola")
                input2.setText("hola")
            }

            activity.runOnUiThread {
                btnComparar.performClick()
            }

            assertEquals("Los caracteres son iguales.", lblResultado.text.toString())

            activity.runOnUiThread {
                input1.setText("hola")
                input2.setText("chau")
            }

            activity.runOnUiThread {
                btnComparar.performClick()
            }

            assertEquals("Los caracteres son diferentes.", lblResultado.text.toString())
        }
    }
}