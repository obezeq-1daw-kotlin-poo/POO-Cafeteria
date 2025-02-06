class Taza(color: Color = Color.BLANCO, val capacidad: Int = 50) {
    var color: Color = color
    var cantidad: Int = 0
        set(value) {
            field = if (value > capacidad) capacidad else value
        }

    fun llenar() {
        cantidad = capacidad
    }

    fun llenar(cantidadNueva: Int) {
        cantidad = cantidadNueva
    }

    override fun toString(): String {
        return "Taza(color = ${color.name}, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

    companion object {
        fun nuevaTazaAleatoria(): Taza {
            val colores = Color.entries
            val colorAleatorio = colores.random()
            val capacidades = listOf(50, 75, 100)
            return Taza(colorAleatorio, capacidades.random())
        }
    }
}