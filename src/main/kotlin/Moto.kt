class Moto(
    modelo : String,
    velocidad : Int,
    carburante: String?,
    var cilindrada: Int = 50) : Vehiculo(modelo, 4, velocidad, carburante) { // Con el 4 de ruedas, indica que TODOS los

    override fun toString(): String {
        var textoSalida = super.toString()
        textoSalida += "Cilindrada de $cilindrada"
        return textoSalida
    }
}