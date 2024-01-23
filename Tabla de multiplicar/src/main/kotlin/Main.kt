import kotlin.math.min

/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNum (min: Int, max: Int): Int {

    var num: Int

    do {
        print("Introduzca un número entre 0 y 100: ")
        try {
            num = readln().toInt()
        }
        catch (e:NumberFormatException){
            num = min - 1
            println("**Error** Número no válido (pulse ENTER para continuar...)")
        }


    }while (num < min || num > max)

    return num

}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta (text: String): Boolean {
    println(text)
    val text = readln().toBoolean()

    while (text)
        print("**Respuesta no válida** (pulse ENTER para continuar...)")
        readln()
    return text

}


fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"

    do {
        val num = pedirNum(min = 1, max = 100)

        val tabla = Array<String>(11) { it -> "$it = $it * $num = ${num * it}"}

        for (linea in tabla) {
            println(linea)
        }

    }while (!pregunta("Desea generar otra tabla de multiplicación? (s/n)"))

}
