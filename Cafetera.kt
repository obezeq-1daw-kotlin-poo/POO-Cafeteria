class Cafetera(val ubicacion: String, capacidadMaxima: Int = 1000, cantidadInicial: Int = 0) {
    val capacidad: Int = capacidadMaxima
    var cantidad: Int = cantidadInicial
        set(value) {
            field = when {
                value > capacidad -> capacidad
                value < 0 -> 0
                else -> value
            }
        }

    constructor(ubicacion: String, capacidadMaxima: Int) : this(ubicacion, capacidadMaxima, capacidadMaxima)

    init {
        cantidad = if (cantidadInicial > capacidad) capacidad else cantidadInicial
    }

    fun llenar() {
        cantidad = capacidad
    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(cantidadAgregar: Int = 200) {
        cantidad += cantidadAgregar
    }

    fun servirTaza(taza: Taza) {
        val puedeServir = minOf(cantidad, taza.capacidad)
        if (puedeServir > 0) {
            cantidad -= puedeServir
            taza.llenar(puedeServir)
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}