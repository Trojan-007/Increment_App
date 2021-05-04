package com.example.incrementhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var increment_textView = findViewById<TextView>(R.id.increment_textview)

        var button_increment = findViewById<Button>(R.id.button_increment)

        var increment_number = 0

        button_increment.setOnClickListener {
            increment_number++

            increment_textView.text = increment_number.toString()
        }
    }

}