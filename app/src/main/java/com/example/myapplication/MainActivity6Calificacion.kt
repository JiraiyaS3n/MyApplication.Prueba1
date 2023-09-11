package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.Toast // sirve para mensaje

class MainActivity6Calificacion : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity6_calificacion)

        val ratingBar:RatingBar = findViewById(R.id.ratingBar)
        val progressBar:ProgressBar = findViewById(R.id.progressBar)
        val radioButton1:RadioButton = findViewById(R.id.RadioID)
        val radioButton2:RadioButton = findViewById(R.id.RadioID2)
        val checkBox:CheckBox = findViewById(R.id.checkBox)
        val btnOff: Button = findViewById(R.id.CierreSesion)
        progressBar.progress = 20 //timepo que figura la carga
        progressBar.visibility = View.INVISIBLE // que este invisible pero cuando se califique, que cargue.

        // obtener la calificacion seleccionada
        val rating = ratingBar.rating //creamos la varible
        ratingBar.numStars = 5   //definimos cantidad maxima de calificacion
        ratingBar.setOnRatingBarChangeListener{_,rating, _ ->
            Toast.makeText(this, "calificacion: $rating", Toast.LENGTH_SHORT).show()

            //progres bar Barra de carga o progreso, esto entrega delay en tiempo
            progressBar.visibility = View.VISIBLE
        }

        radioButton1.setOnClickListener{
            Toast.makeText(this, "opcion 1: $radioButton1", Toast.LENGTH_SHORT).show()
        }
        radioButton2.setOnClickListener{
            Toast.makeText(this, "opcion 1: $radioButton2", Toast.LENGTH_SHORT).show()
        }

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Marcado", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Desmarcado", Toast.LENGTH_SHORT).show()
            }
        }

        btnOff.setOnClickListener {
            Toast.makeText(this, "Sesión Cerrada.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }

}