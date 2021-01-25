class Coche(
    modelo : String,
    velocidad : Int,
    carburante: String?,
    // Aqui decimos que hay 4 puertas por defecto en todos los coches, pero se podría cambiar dandole otro valor
    var puertas: Int = 5) : Vehiculo(modelo, 4, velocidad, carburante) { // Con el 4 de ruedas, indica que TODOS los
    // coches tienen 4 ruedas. Es IMPOSIBLE crear un coche con menos ruedas.

    override fun acelerar(){
        velocidad += 30
    }

    override fun frenar() {
        if (velocidad > 30){
            // Super hace referencia al Padre
            super.frenar()
        }
    }

    override fun toString(): String {
        var textoSalida = super.toString()
        textoSalida += "Tiene $puertas puertas\n"
        return textoSalida
    }

}