package com.tdam.clasesherencia

class Pokemon(var nombre:String, var tipo:String = "Normal", var nivel:Int = 1) {

    var ataques : MutableList<Ataque>

    init {
        ataques = mutableListOf()
    }

    //var nombre: String = ""
    //array de ataques


    constructor() : this("Pokemon sin nombre", "Noormal", 1)

    //constructor secundario con parametros del pokemon y ataques
    constructor(nombre:String, tipo:String, nivel:Int, ataques:MutableList<Ataque>) : this(nombre, tipo, nivel){
        this.ataques = ataques
    }



    fun atacar(){
        println("Atacando")
    }

    //override de atacar()
    fun atacar(ataque:String){
        println("Atacando con $ataque")
    }

    override fun toString(): String {
        return "Pokemon(nombre='$nombre', tipo='$tipo', nivel=$nivel)"
    }


}