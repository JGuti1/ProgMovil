package com.example.tareamovil

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tareamovil.databinding.ActivityMainBinding

//Johan David Gutierrez Garcia
class MainActivity : AppCompatActivity() {

    lateinit var campoA: EditText
    lateinit var campoB: EditText
    lateinit var resultado: EditText
    lateinit var botonMayor: Button
    lateinit var botonMenor: Button
    lateinit var botonRaizA: Button
    lateinit var botonRaizB: Button
    lateinit var botonelevado2: Button
    lateinit var botonelevado5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val enlace = ActivityMainBinding.inflate(layoutInflater)

        campoA = enlace.CampoNumA
        campoB = enlace.CampoNumB
        resultado = enlace.CampoResultado
        botonMayor = enlace.btnMayorAB
        botonMenor = enlace.btnMenorAB
        botonRaizA = enlace.raizA
        botonRaizB = enlace.raizB
        botonelevado2 = enlace.btnAelevado2
        botonelevado5 = enlace.Aelevado5

        botonMayor.setOnClickListener { view ->
            mayor(view)
        }

        botonMenor.setOnClickListener { view ->
            menor(view)
        }

        botonRaizA.setOnClickListener { view ->
            raizA(view)
        }

        botonRaizB.setOnClickListener { view ->
            raizB(view)
        }

        botonelevado2.setOnClickListener { view ->
            elevado2(view)
        }

        botonelevado5.setOnClickListener { view ->
            elevado5(view)
        }


        setContentView(enlace.root)

    }

    //Funciones
    fun mayor(view: View) {
        val valorA = campoA.text.toString()
        val valorB = campoB.text.toString()

        if (valorA.isNotEmpty() && valorB.isNotEmpty()) {
            // Convertir los valores a números (Double para manejar decimales)
            val numA = valorA.toDouble()
            val numB = valorB.toDouble()

            if (numA > numB) {
                resultado.setText("A es mayor que B")
            } else if (numB > numA) {
                resultado.setText("B es mayor que A")
            } else {
                resultado.setText("A y B son iguales")
            }
        }

    }

    fun menor(view: View) {
        val valorA = campoA.text.toString()
        val valorB = campoB.text.toString()

        if (valorA.isNotEmpty() && valorB.isNotEmpty()) {
            // Convertir los valores a números (Double para manejar decimales)
            val numA = valorA.toDouble()
            val numB = valorB.toDouble()

            if (numA > numB) {
                resultado.setText("B es menor que A")
            } else if (numB > numA) {
                resultado.setText("A es menor que B")
            } else {
                resultado.setText("A y B son iguales")
            }
        }

    }

    fun raizA(view: View) {
        val valorA = campoA.text.toString()

        //esto se utiliza para verificar que el campo no este vacio
        if (valorA.isNotEmpty()) {
            //lo convierte a double para manejar mejor los decimales
            val numA = valorA.toDouble()

            if (numA < 0) {
                resultado.setText("No se puede calcular un numero negativo")

            } else {
                val raiz = Math.sqrt(numA)

                resultado.setText("Raiz de A: $raiz")
            }
        } else {
            // Mostrar un mensaje si el campo está vacío
            resultado.setText("Por favor, ingresa un valor en el campo A")
        }
    }

    fun raizB(view: View) {
        val valorB = campoB.text.toString()

        //esto se utiliza para verificar que el campo no este vacio
        if (valorB.isNotEmpty()) {
            //lo convierte a double para manejar mejor los decimales
            val numB = valorB.toDouble()

            if (numB < 0) {
                resultado.setText("No se puede calcular un numero negativo")

            } else {
                val raiz = Math.sqrt(numB)

                resultado.setText("Raiz de B: $raiz")
            }
        } else {
            // Mostrar un mensaje si el campo está vacío
            resultado.setText("Por favor, ingresa un valor en el campo B")
        }
    }

    fun elevado2(view: View) {
        val valorA = campoA.text.toString()

        //esto se utiliza para verificar que el campo no este vacio
        if (valorA.isNotEmpty()) {
            //lo convierte a double para manejar mejor los decimales
            val numA = valorA.toDouble()

                 val elevar2 = Math.pow(numA,2.0)

                resultado.setText("A elevado a la 2 es: $elevar2")

        }
        else{
            resultado.setText("Por favor, ingresa un valor en el campo A")
        }
    }

    fun elevado5(view: View) {
        val valorA = campoA.text.toString()

        //esto se utiliza para verificar que el campo no este vacio
        if (valorA.isNotEmpty()) {
            //lo convierte a double para manejar mejor los decimales
            val numA = valorA.toDouble()

                val elevar2 = Math.pow(numA,5.0)

                resultado.setText("A elevado a la 5 es: $elevar2")

        }
        else{
            resultado.setText("Por favor, ingresa un valor en el campo A")
        }
    }
}