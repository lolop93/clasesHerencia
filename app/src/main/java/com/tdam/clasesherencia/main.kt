package com.tdam.clasesherencia

const val PI = 3.1416

//podemos hacer privada las constantes

private const val PI_privado = 3.1416

fun main(){

//    var pokemon1 = Pokemon("Pikachu")
//
//    //pokemon1.nombre = "Pikachu"
//    pokemon1.atacar()
//    pokemon1.nombre = "Pikachu"
//
//
//    println(Pokemon("Squirtle"))
//    println(Pokemon("Charmander").nombre)



//    var pokemon2 = Pokemon("Charmander", "Fuego", 5)
//
//    println(pokemon2.nombre + " " + pokemon2.tipo + " " + pokemon2.nivel)
//
//    var pokemon3 = Pokemon() //funciona porque tenemos todos los argumentos con valores por defecto
//
//    println(pokemon3.nombre + " " + pokemon3.tipo + " " + pokemon3.nivel)



//    var pokemon4 = Pokemon("Pikachu", "Electrico", 5)
//    pokemon4.atacar() //Ataque por defecto
//    pokemon4.atacar("Impactrueno") //Ataque con parámetro
//
//    println(pokemon4.toString())
//    //o
//    println(pokemon4)

    //Sale lo mismo porque hemos sobrecargado el método toString() en la clase Pokemon sino saldría la dirección de memoria del objeto
    //el metodo toString() es un metodo de la clase Any que es la clase padre de todas las clases en Kotlin
    //y por lo tanto de la clase Pokemon



//    var pokemonDefault = Pokemon()
//    println(pokemonDefault.ataques)
//
//    pokemonDefault.ataques = mutableListOf(
//        Ataque("Impactrueno", "Electrico", 40),
//        Ataque("Rayo", "Electrico", 90),
//        Ataque("Placaje", "Normal", 40)
//    )
//
//    println(pokemonDefault.ataques)



    var pokemonDefault = Pokemon()

    pokemonDefault.asignarAtaques(mutableListOf(
        Ataque("Impactrueno", "Electrico", 40),
        Ataque("Rayo", "Electrico", 90),
        Ataque("Placaje", "Normal", 40)
    ))
    println(pokemonDefault.obtenerAtaques())



    //Llamamos a los set y get de felicidad
    pokemonDefault.felicidad = 0.5f
    println(pokemonDefault.felicidad)





}