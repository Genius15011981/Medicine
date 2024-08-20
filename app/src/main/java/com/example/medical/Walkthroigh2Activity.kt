package com.example.medical

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Walkthroigh2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.walkthrough2)

    }

    fun next(view: View) {
        val intent = Intent(this, Walkthrough3Activity::class.java)
        startActivity(intent)
    }
}