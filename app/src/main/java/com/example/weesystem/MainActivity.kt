package com.example.weesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var card = findViewById<CardView>(R.id.background_card)
        card.setOnClickListener{
            startActivity(Intent(this,Backgroud::class.java))


        }
    }
}