class Taza(
    val color: String = "blanco",
    val capacidad: Double = 50.0
) {

    var cantidad: Double = 0.0

    fun checkCapacidadSobresalida() {
        if (cantidad > capacidad) {
            cantidad = capacidad
        }
    }

    init {
        checkCapacidadSobresalida()
    }

}