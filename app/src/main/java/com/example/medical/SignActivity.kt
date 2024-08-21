package com.example.medical

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.medical.R.id

class SignActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        val btn: Button =findViewById<Button>(id.nxt_btn)
        btn.setOnClickListener{

            val intent=Intent(this, CreatActivity::class.java)
            startActivity(intent)

        }
    }

     fun google_ac(view: View) {}
    fun facebook_ac(view: View) {}
    fun apple_ac(view: View) {}
    fun next(view: View) {

    }
}