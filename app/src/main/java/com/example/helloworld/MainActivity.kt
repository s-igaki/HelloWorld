package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helloWorldText: TextView = findViewById(R.id.textView1)
        var helloWorldButton: Button = findViewById(R.id.button1)
        helloWorldButton.setOnClickListener{
            if (helloWorldText.text == "Hello World!") {
                helloWorldText.text = "pushed buttton"
            } else {
                helloWorldText.text = "Hello World!"
            }
        }
    }
}