fun main() {
    println("Hello World!")

    val vehiculo1 = Vehiculo("Tesla X", 4, 100, "Electrico")
    //vehiculo1.acelerar()
    //vehiculo1.frenar()
    val vehiculo2 = Vehiculo("Renault Clio", 4, 120, "Gasolina")
    val vehiculo3 = Vehiculo("Seat Ibiza", 4, 90, "Diesel")
    val vehiculo4 = Vehiculo("Bicicleta", 4, 10, null)

    val coche1 = Coche("Ferrari", 130, null) // No hace falta poner el número de puertas

    println(vehiculo1.toString())
    println(coche1.toString())
    coche1
}