package com.tdam.clasesherencia

class Ataque (var nombre:String, var tipo:String, var potencia:Int){

    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo='$tipo', potencia=$potencia)"
    }

}
