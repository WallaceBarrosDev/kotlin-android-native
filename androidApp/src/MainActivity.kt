package org.example.kotlinandroidtest

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    
    val textView = findViewById<TextView>(R.id.text)
    val buttonClick = findViewById<Button>(R.id.button)

    buttonClick.setOnClickListener {
      textView.text = "Você clicou no botão !"
    }
  }
}
