package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "Checkbox is checked $isChecked" , Toast.LENGTH_LONG).show()
        }
    }
}