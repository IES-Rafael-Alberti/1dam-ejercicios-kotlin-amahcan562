fun main() {
    fun businessEmail(s: String): Boolean {
        return s.contains("@") && s.contains("business.com")
    }

fun isAnEmail(email: (String) -> Boolean) {
    print("Introduzca su email: ")

    if (email(readln())) {
        println("Email de empresa correcto.")
    }
    else {
        println("Email incorrecto.")
    }

    }
    isAnEmail(::businessEmail)
}