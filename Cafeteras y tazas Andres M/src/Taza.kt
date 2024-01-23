class Taza(val color: String = "Blanco", val capacidad: Int = 50, val cantidad: Int = 0) {
    override fun toString(): String {
        return ("Taza (color = ${this.color}, capacidad = ${this.capacidad}c.c., cantidad = ${this.cantidad}c.c.)")
    }



    enum class Color {blanco, negro, gris, azul, verde}
}