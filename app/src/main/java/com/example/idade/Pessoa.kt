package com.example.idade

import android.os.Bundle
import java.io.Serializable

class Pessoa: Serializable {

    var nome: String
    var ano: Int

    constructor(nome: String, ano: Int){
        this.nome = nome
        this.ano = ano
    }
    fun idade(): Int{
        return 2021 - this.ano
    }
}