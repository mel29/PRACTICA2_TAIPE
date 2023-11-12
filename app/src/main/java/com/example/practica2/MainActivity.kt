package com.example.practica2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.practica2.model.TeamModel
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseUser

import com.google.firebase.firestore.FirebaseFirestore

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNomTeam: EditText = findViewById(R.id.txtNomTeam)
        val etAnio: EditText = findViewById(R.id.txtAnio)
        val etnumtitulos: EditText = findViewById(R.id.txtNumTitulos)
        val etURL: EditText = findViewById(R.id.txtURL)
        val btnSaveRegister: Button = findViewById(R.id.btnSave)


        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("users")

        btnSaveRegister.setOnClickListener {
            val etNomTeam = etNomTeam.text.toString()
            val etAnio = etAnio.text.toString()
            val etnumtitulos = etnumtitulos.text.toString()
            val etURL = etURL.text.toString()




                }

        }



    }
