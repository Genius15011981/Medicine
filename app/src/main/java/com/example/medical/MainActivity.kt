package com.example.medical

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.medical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
        binding.prbar.startAnimation(animation)
        val animate = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
        binding.imgv.startAnimation(animate)
    }

    fun next(view: View) {
        val intent= Intent(this,Walkthroigh1Activity::class.java)
        startActivity(intent)
    }
}