package com.example.iponto

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iponto.databinding.ActivityMain2Binding
import com.example.iponto.databinding.ActivityMain3Binding

private lateinit var binding: ActivityMain3Binding
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val valortotal = intent.getIntExtra("valortotal",0)
        val data = intent.getStringExtra("data")
        val hora = intent.getStringExtra("hora")


        binding.textView3.text = valortotal.toString()
//         = data.toString()

    }
}