class MiClase {
    // Propiedades de la clase

    companion object {
        const val CONSTANTE_CLASE = "Valor de la constante de la clase"

        fun funcionEstatica() {
            println("Esta es una función estática relacionada con la clase")
        }
    }

    fun funcionNormal() {
        println("Esta es una función de instancia de la clase")
    }
}

fun main() {
    // Accediendo a la constante y la función del Companion object
    println(MiClase.CONSTANTE_CLASE)
    MiClase.funcionEstatica()

    // Creando una instancia de la clase y llamando a una función de instancia
    val instancia = MiClase()
    instancia.funcionNormal()
}
