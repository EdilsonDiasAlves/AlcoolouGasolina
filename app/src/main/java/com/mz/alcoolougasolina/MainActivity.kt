package com.mz.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculaPrecos(view: View){

        //val editPrecoAlcool = findViewById<EditText>(R.id.edit_preco_alcool)
        //val precoAlcool = editPrecoAlcool.text.toString()
        var precoAlcool = edit_preco_alcool.text.toString()
        var precoGasolina = edit_preco_gasolina.text.toString()

        calcularMelhorPreco(precoGasolina, precoAlcool)
    }

    fun calcularMelhorPreco(valGasolina: String, valAlcool: String) {

        var resultado:String = "Informe os preços da gasolina e do álcool"

        /* Calcula alcool / gasolina
         * se o resultado >= 0.7 melhor utilizar gasolina
         * caso contrário, melhor utilizar Álcool
         */

        if((valAlcool != null && !valAlcool.isEmpty()) &&
            (valGasolina != null && !valGasolina.isEmpty() && valGasolina.toDouble() > 0)) {

            val valorGasolina = valGasolina.toDouble()
            val valorAlcool = valAlcool.toDouble()

            val valorCalculado = valorAlcool/valorGasolina;
            resultado =
                if (valorCalculado >= 0.7) "Abasteça com gasolina!" else "Abasteça com álcool!"
        }

        text_resultado.setText(resultado)
    }
}