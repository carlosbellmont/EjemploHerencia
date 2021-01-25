fun main() {
    println("Hello World!")

    val vehiculo1 = Vehiculo("Tesla X", 4, 100, "Electrico")
    //vehiculo1.acelerar()
    //vehiculo1.frenar()
    val vehiculo2 = Vehiculo("Renault Clio", 4, 120, "Gasolina")
    val vehiculo3 = Vehiculo("Seat Ibiza", 4, 90, "Diesel")
    val vehiculo4 = Vehiculo("Bicicleta", 4, 10, null)

    val coche1 = Coche("Ferrari", 130, null) // No hace falta poner el número de puertas
    val moto1 = Moto("Vespa", 20, null) // No hace falta poner el número de puertas

    println(vehiculo1.toString())
    println(coche1.toString())
    println(moto1.toString())


    // INTERFACE
    val listaArrancalbes = listOf<Arrancable>(coche1, moto1)
    listaArrancalbes.forEach {
        it.arrancar()
    }





    // EXTENSIONES

    // Queremos contar cuantos números hay en un String:
    // Opcion a) crearlo en el propio Main. Malilla...
    // Opcion b) crear una funcion que cuente los caracteres
    // Opcion c) crear una extension <----- LA BUENA
    val texto = "a1s2d3f4g1"

    // Opcion A
    var contador = 0
    texto.forEach {
        if (it in '0'..'9') {
            contador++
        }
    }
    println("El string $texto tiene $contador digitos")

    // Opcion b
    val texto2 = "98547cni y3io4t7o31y n45o3725bc745"
    val contador2 = contarCaracteres(texto2)
    println("El string $texto2 tiene $contador2 digitos")

    // Opcion c
    texto.contarChars()
}

// Opcion b
fun contarCaracteres(texto : String) : Int {
    var contador = 0
    texto.forEach {
        if (it in '0'..'9') {
            contador++
        }
    }
    return contador
}

// Opcion c
fun String.contarChars() : Int {
    var contador = 0
    forEach {
        if (it in '0'..'9') {
            contador++
        }
    }
    return contador
}
