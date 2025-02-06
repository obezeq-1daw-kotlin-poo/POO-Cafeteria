fun main() {
    val cafeteraSalon = Cafetera("Salón")
    val cafeteraCocina = Cafetera("Cocina", 750)
    val cafeteraOficina = Cafetera("Oficina", 500, 200)

    println("╔════════════════╗")
    println("║  « CAFETERA »  ║")
    println("╠════════════════╠")
    println("║▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓║")
    println("╚════════════════╝")

    print("\n[+] ¿Número de tazas a llenar? ")
    val numTazas = readLine()!!.toInt()
    val listaTazas = mutableListOf<Taza>()
    for (i in 1..numTazas) {
        listaTazas.add(Taza.nuevaTazaAleatoria())
    }

    println("\n──────────────────────────────────────────────────────────────────")
    println("                          Estado inicial                          ")
    println("──────────────────────────────────────────────────────────────────")

    println(cafeteraSalon)
    println(cafeteraCocina)
    println(cafeteraOficina)

    println("\n░░░░░░░░░░░")
    println("░░ Tazas ░░")
    println("░░░░░░░░░░░")

    for (taza in listaTazas) {
        println(taza)
    }

    cafeteraSalon.llenar()
    cafeteraCocina.vaciar()
    cafeteraCocina.agregarCafe(cafeteraCocina.capacidad / 2)
    cafeteraOficina.agregarCafe(400)

    println("\n──────────────────────────────────────────────────────────────────")
    println("                 Después de preparar cafeteras                    ")
    println("──────────────────────────────────────────────────────────────────")
    println(cafeteraSalon)
    println(cafeteraCocina)
    println(cafeteraOficina)

    var tazasServidas = 0
    for (taza in listaTazas) {
        when {
            cafeteraSalon.cantidad > 0 -> cafeteraSalon.servirTaza(taza)
            cafeteraCocina.cantidad > 0 -> cafeteraCocina.servirTaza(taza)
            cafeteraOficina.cantidad > 0 -> cafeteraOficina.servirTaza(taza)
            else -> break
        }
        tazasServidas++
    }

    println("\n──────────────────────────────────────────────────────────────────")
    println("                          Estado final                            ")
    println("──────────────────────────────────────────────────────────────────")
    println(cafeteraSalon)
    println(cafeteraCocina)
    println(cafeteraOficina)
    println("\n░░ Tazas servidas ($tazasServidas de ${listaTazas.size}) ░░")
    for (taza in listaTazas) {
        println(taza)
    }
}