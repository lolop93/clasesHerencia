package com.tdam.clasesherencia

open class Pokemon(private var _nombre:String, var tipo:String = "Normal", var nivel:Int = 1) {

    var ataques : MutableList<Ataque>
    var tipo2 : TypePokemon = TypePokemon.ELECTRICO //por default es electrico

    var nombre: String = _nombre
        get() = field
        set(value) {
            field = value
        }
    var felicidad: Float = 0.0f
        get() = field
        set(value) {
            field = value
        }

    init {
        ataques = mutableListOf()
    }

    constructor() : this("Pokemon sin nombre", "Normal", 1)

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


    fun obtenerAtaques():String{
        return ataques.toString()
    }

    fun asignarAtaques(ataques: MutableList<Ataque>){
        this.ataques = ataques
    }

//    fun setAtaques(ataques: MutableList<Ataque>){
//        this.ataques = ataques
//    }



    override fun toString(): String {
        return "Pokemon(nombre='$nombre', tipo='$tipo', nivel=$nivel)"
    }

    fun setTipo2(tipo: TypePokemon){ //le pasamos un enum de tipo TypePokemon
        this.tipo2 = tipo
    }




}