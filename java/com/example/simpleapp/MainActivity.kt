package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ui = findViewById<EditText>(R.id.radius)
        val res = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener()
        {
            var pi:Double=3.14
            var r=ui.getText().toString().toDouble()
            var a=pi*r*r
            res.setText(a.toString())
        }

    }
}