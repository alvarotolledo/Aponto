package com.example.iponto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.iponto.databinding.ActivityMainBinding
import kotlin.concurrent.thread

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        Thread.sleep(2500)
        installSplashScreen()
        setContentView(binding.root)


        binding.btnSoma.setOnClickListener {
            val subtrair = binding.rcValor.text.toString().toInt()



                intent = Intent(this, MainActivity2::class.java)
                intent.putExtra( "123" , subtrair)
                startActivity(intent)



        }

    }
}