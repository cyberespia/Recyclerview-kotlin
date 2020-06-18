package com.mariox.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = ArrayList<itemDatos>()

        datos.add(itemDatos("titulo 1",R.drawable.a1))
        datos.add(itemDatos("titulo 2",R.drawable.a2))
        datos.add(itemDatos("Titulo 3", R.drawable.a3))
        datos.add(itemDatos("Titulo 4", R.drawable.a4))
        datos.add(itemDatos("Titulo 5", R.drawable.a5))
        datos.add(itemDatos("Titulo 6", R.drawable.a6))
        datos.add(itemDatos("Titulo 7", R.drawable.a7))
        datos.add(itemDatos("Titulo 8", R.drawable.a8))
        datos.add(itemDatos("Titulo 9", R.drawable.a9))
        datos.add(itemDatos("Titulo 10", R.drawable.a10))

        recycler1.layoutManager = LinearLayoutManager(this)
       recycler1.adapter = miAdaptador(datos)

    }
}