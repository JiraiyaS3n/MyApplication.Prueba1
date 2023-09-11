package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var usenameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var logindButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usenameEditText = findViewById(R.id.userTxt)
        passwordEditText = findViewById(R.id.claveTxt)
        logindButton = findViewById(R.id.loginBoton)

        logindButton.setOnClickListener{
            validarUsuario()
        }
    }
    //para validar usuario, se utiliza variable local
    private fun validarUsuario(){
        val usuario = usenameEditText.text.toString()
        val clave = passwordEditText.text.toString()

        if(usuario == "DiegoC" && clave == "123456")
        {
            //para motrar en panta si es o no el uduario
            Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this,MainActivity2:: class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Usuario No existe", Toast.LENGTH_SHORT).show()
        }


    }
}