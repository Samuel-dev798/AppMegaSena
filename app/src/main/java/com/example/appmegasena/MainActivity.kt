package com.example.appmegasena

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text
import java.util.Random
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    private lateinit var prefs: SharedPreferences

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //search for objects and have their reference.
        val editText: EditText = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.text_result)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

        //preferences database
        prefs = getSharedPreferences("db", Context.MODE_PRIVATE)
        val result = prefs.getString("result", null)

        //checks if the value is null
        result?.let {
            txtResult.text = "Última aposta: $result"
        }


        btnGenerate.setOnClickListener {

            val text = editText.text.toString()

            numberGenerator(text, txtResult)
        }
    }

    private fun numberGenerator(text: String, txtResult: TextView) {
        //validate when field is empty
        if (text.isEmpty()) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }
        val qtd = text.toInt()// convert to integer

        //validate if the field is between 6 and 15(failure)
        if (qtd < 6 || qtd > 15) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }
        //successful validation of conditions
        val numbers = mutableSetOf<Int>()
        val random = Random()

        //loop
        while (true) {
            val number = random.nextInt(60)//0...59
            numbers.add(number + 1)

            //end of loop
            if (numbers.size == qtd) {
                break
            }
        }
        txtResult.text = numbers.joinToString(" - ")

        val editor = prefs.edit()
        editor.putString("result", txtResult.text.toString())
        editor.apply() // sincrona
    }
}

//commit -> salva de forma sicrona (bloquea a interface) e informa se teve sucesso ou não.
//apply -> salva de forma assicrona (nao bloquea a inteface grafica) e não informa se teve sucesso ou não.


