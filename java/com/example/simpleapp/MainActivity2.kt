package com.example.simpleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val sp=findViewById<Spinner>(R.id.spinner)
        val background=findViewById<ConstraintLayout>(R.id.Layout)
        val button=findViewById<Button>(R.id.sp_button)
        button.setOnClickListener()
        {
            val st:String=sp.selectedItem.toString()
            when(st) {
                "Red"->background.setBackgroundColor(Color.RED)
                "Green"->background.setBackgroundColor(Color.GREEN)
                "Grey"->background.setBackgroundColor(Color.GRAY)
            }
        }
    }

}