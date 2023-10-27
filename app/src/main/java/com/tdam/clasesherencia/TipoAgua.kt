package com.tdam.clasesherencia

class TipoAgua (): Pokemon() {

    constructor(nombre:String, tipo:String, nivel:Int, ataques:MutableList<Ataque>) : this(){
        this.ataques = ataques
    }


}