package com.example.iponto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.iponto.databinding.ActivityMain2Binding

private lateinit var binding: ActivityMain2Binding
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        recuperardados()

            binding.textoValo.text = "€" + intent.getIntExtra("123", 0).toString()

    }




    private fun recuperardados() {

        var contador = 0
        var editTextNumber = intent.getIntExtra("123", 0)

        binding.button.setOnClickListener {
            val input = editTextNumber.toString()
            if (input.isNotEmpty()) {
                val valor = input.toIntOrNull()
                if (valor != null) {
                    contador += valor
                    binding.viewTv.text = contador.toString()
                }


            }

        }

        binding.limpa.setOnClickListener {
            binding.viewTv.setText("0")
            contador = 0
        }


    }
}