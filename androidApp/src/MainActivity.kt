package org.example.kotlinandroidtest

import android.app.Activity
import android.os.Bundle
import android.view.View

import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

// TODO: Exercícios:
// 1. constador de clicks com reset
// 2. tela de logion simples
// 3. Lista de tarefas minima
// 4. Calculadora básica

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    
    val form = findViewById<LinearLayout>(R.id.form)
    val input = findViewById<EditText>(R.id.input)
    val buttonClick = findViewById<Button>(R.id.button)
    val text = findViewById<TextView>(R.id.text)
    
    buttonClick.setOnClickListener {
      val name = input.text.toString().trim()

      if (name.isNotBlank()) {
        form.visibility = View.GONE
        text.text = "bem vindo $name"
        text.visibility = View.VISIBLE
      }
    }
  }
}
