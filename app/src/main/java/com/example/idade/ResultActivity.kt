package com.example.idade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        this.resultado = findViewById(R.id.resultado)


        val pessoa = intent.getSerializableExtra("pessoa") as Pessoa
        val idade = pessoa.idade().toString()
        val nome = pessoa.nome

        this.resultado.setText("$nome, você possui $idade anos!")

        this.resultado.setOnClickListener{ finish() }

    }

}