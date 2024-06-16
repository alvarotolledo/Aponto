package com.example.iponto

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.iponto.databinding.ActivityMain2Binding
import java.util.Date
import java.util.Locale

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

                val now = Date()
                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

                val date = dateFormat.format(now)
                val time = timeFormat.format(now)

                val loou = contador
                intent = Intent(this, MainActivity3::class.java)
                intent.apply {
                    intent.putExtra("valortotal", loou)
                    intent.putExtra("data", date)
                    intent.putExtra("hora", time)

                }
                startActivity(intent)

            }


        }

        binding.limpa.setOnClickListener {
            clean()
        }


    }

    private fun clean() {
        binding.viewTv.setText("0")
        binding.textoValo.setText("0")
    }
}