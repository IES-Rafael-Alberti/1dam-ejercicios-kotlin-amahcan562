fun main() {

    var r2d2pos: List<Int>

    r2d2pos = moverRobot(10, -5, 2)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir ${orientacionRobot(r2d2pos[2])},")

    moverRobot(0, 0, 0)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir ${orientacionRobot(r2d2pos[2])},")

    moverRobot()
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir ${orientacionRobot(r2d2pos[2])},")

    moverRobot(1, 9)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir ${orientacionRobot(r2d2pos[2])},")

}

fun orientacionRobot(dir: Int) = when (dir) {
    0 -> "POSITIVEY"
    1 -> "NEGATIVEX"
    2 -> "NEGATIVEY"
    3 -> "POSITIVEX"
    else -> ""
}

fun moverRobot(vararg movs: Int): List<Int> {

    var posX = 0
    var posY = 0
    var dir = 0 //0 => POSITIVEY; 1 => NEGATIVEX; 2 => NEGATIVEY; 3 => POSITIVEX

    for (pasos in movs) {
        when (dir) {
            0 -> posY += pasos
            1 -> posY -= pasos
            2 -> posY -= pasos
            3 -> posY += pasos
        }
        if (dir == 3) dir = 0 else dir++
    }
    return listOf(posX, posY, dir)
}