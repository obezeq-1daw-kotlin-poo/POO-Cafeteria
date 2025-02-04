class Cafetera(private val ubicacion: String) {

    private var capacidad: Double = 1000.0
    private val capacidadMaxima: Double = 1000.0
    private var cantidad: Double = 0.0

    constructor(ubicacion: String, capacidad: Double) :  this(ubicacion) {
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Double, cantidad: Double) :  this(ubicacion, capacidad) {

        if (cantidad > capacidad)
            this.cantidad = capacidad
        else
            this.cantidad = cantidad

    }

    fun llenar() {
        cantidad = capacidad
    }

    fun vaciar() {
        cantidad = 0.0
    }

    fun agregarCapacidad(cantidad: Double = 200.0) {
        if (cantidad + this.cantidad > this.capacidad) {
            this.cantidad = this.capacidad
        } else {
            this.cantidad += cantidad
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicacion = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

}