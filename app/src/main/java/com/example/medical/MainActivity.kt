package com.example.medical

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progress = findViewById<ImageView>(R.id.prbar)
        progress.animate().apply {
            duration = 1000
                alpha(.5f)
                .rotationBy(360f)
            translationXBy(200f)
        }.withEndAction {
            progress.animate().apply {
                duration = 1000
                alpha(1f)
                rotationBy(360f)
                translationXBy(-200f)
            }

        }.start()

    }

    fun next(view: View) {
        val intent= Intent(this,Walkthroigh1Activity::class.java)
        startActivity(intent)
    }
}