package com.example.weesystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Backgroud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backgroud)

    var image = findViewById<ImageView>(R.id.flecha_back)
    image.setOnClickListener   {
        startActivity(Intent(this, MainActivity::class.java))

    }
    }

}