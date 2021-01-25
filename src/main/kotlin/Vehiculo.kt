open class Vehiculo(var modelo : String, var ruedas : Int, var velocidad : Int, var carburante : String?) {

    // El Init se ejecuta siempre al crear un nuevo objeto de la clase Vehiculo
    init {
        println("Estoy en el init")
        if (carburante == null){
            println("El carburante era null, por lo que pongo que es desconocido")
            carburante = "Desconocido"
        } else {
            println("El carburante es $carburante")
        }
    }

    open fun acelerar(){
        velocidad += 10
    }

    open fun frenar(){
        if(velocidad > 10) {
            velocidad -= 10
        }
    }

    override fun toString(): String {
        var textoSalida = ""
        textoSalida += "*************************************\n"
        textoSalida += "$modelo\n"
        textoSalida += "Tiene $ruedas ruedas\n"
        textoSalida += "Va a una velocidad de $velocidad\n"
        textoSalida += "Usa un carburante de tipo $carburante\n"
        textoSalida += "*************************************\n"
        return textoSalida
    }

}