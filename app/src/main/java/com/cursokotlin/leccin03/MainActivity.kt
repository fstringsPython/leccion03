package com.cursokotlin.leccin03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cursokotlin.leccin03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var vBind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        vBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vBind.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        vBind.btnComprobar.setOnClickListener { comprobar() }

    }//llave de cierre método on create

    fun comprobar(){

        val nota = vBind.calificacion.text.toString().toFloat()
        val notaA = "A"
        val notaB = "B"
        val notaC = "C"
        val notaD = "D"
        val notaF = "F"

        if(nota >= 90 && nota <=100){
            vBind.tVrespuesta.setText(notaA)
        }
        if(nota >= 80 && nota <=89){
            vBind.tVrespuesta.setText(notaB)
        }
        if(nota >= 70 && nota <=79){
            vBind.tVrespuesta.setText(notaC)
        }
        if(nota >= 60 && nota <=69){
            vBind.tVrespuesta.setText(notaD)
        }
        if(nota < 60){
            vBind.tVrespuesta.setText(notaF)
        }

    }
}