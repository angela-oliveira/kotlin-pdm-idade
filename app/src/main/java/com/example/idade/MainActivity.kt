package com.example.telas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.idade.Pessoa
import com.example.idade.R
import com.example.idade.ResultActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnCalc: Button
    private lateinit var edtNome: EditText
    private lateinit var edtAno: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnCalc = findViewById(R.id.btnCalc)
        this.edtNome = findViewById(R.id.edtNome)
        this.edtAno = findViewById(R.id.edtAno)

        this.btnCalc.setOnClickListener({ clickBotao(it)} )
    }

    fun clickBotao(view: View) {
        val nome = edtNome.text.toString()
        val ano = edtAno.text.toString().toInt()
        val dados = Pessoa(nome, ano)

        val intent = Intent(this, ResultActivity::class.java)

        // val intent = Intent(this, outra::class.java)
        intent.putExtra("MSG_PESSOA", dados)
        startActivity(intent)

        // startActivityForResult(intent, 1)
    }

}