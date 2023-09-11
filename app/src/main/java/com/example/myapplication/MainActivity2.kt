package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1: Button = findViewById(R.id.Pag3sig)
        val btn2: Button = findViewById(R.id.Pag4Sig)
        val btn3: Button = findViewById(R.id.Pag5sig)
        val btnOff: Button = findViewById(R.id.CierreSesion)

        btn1.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity3:: class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity4:: class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity5:: class.java)
            startActivity(intent)
        }

        btnOff.setOnClickListener {
            Toast.makeText(this, "Sesión Cerrada.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}