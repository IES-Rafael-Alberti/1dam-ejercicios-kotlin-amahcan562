class ROBOT (val nombre: String) {
    var posX: Int = 0
    var posY: Int = 0
    var dir: Int = 0

    fun mover(movimientos: IntArray) {
        for (valor in movimientos)
            0 -> this.posY += valor
            1 -> this.posX -= valor
            2 -> this.posY -= valor
            3 -> this.posX += valor
    }

    fun obtenerDireccion() {

    }
}

fun main(){
    val robot1 = ROBOT("R2D2")

    val movimientos = arrayOf(
        intArrayOf(10, 2, -2),
        intArrayOf(0, 0 ,0),
        intArrayOf(),
        intArrayOf(-10, -5, -2),
        intArrayOf(-10, 5, 2, 4, -8)

    for (movimiento in movimientos) {

    }
}