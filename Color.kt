enum class Color {
    BLANCO, NEGRO, GRIS, AZUL, VERDE;

    companion object {
        fun colorAleatorio(): Color {
            return entries.random()
        }
    }
}