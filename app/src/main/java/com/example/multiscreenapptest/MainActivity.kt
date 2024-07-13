package com.example.multiscreenapptest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn)
        val edtFirstName : EditText = findViewById(R.id.edt_first_name)
        val edtLastName : EditText = findViewById(R.id.edt_last_name)

        btn.setOnClickListener {

            val edtFirstNameText = edtFirstName.text.toString()
            val edtLastNameText = edtLastName.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("extra_first_name", edtFirstNameText)
            intent.putExtra("extra_last_name",edtLastNameText)
            startActivity(intent)
        }
    }
}