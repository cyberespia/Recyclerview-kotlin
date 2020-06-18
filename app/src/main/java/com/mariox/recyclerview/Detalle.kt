package com.mariox.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle.*

class Detalle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        //recibo varibale de la actividad 1
        val titulorecido = intent.getStringExtra("titulo")


        val actionbar = supportActionBar
        actionbar!!.title= titulorecido
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayShowHomeEnabled(true)



        tv2.text = titulorecido
    }


    /**
     * funcion para activar flecha de regreso en actionbar
     */
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}