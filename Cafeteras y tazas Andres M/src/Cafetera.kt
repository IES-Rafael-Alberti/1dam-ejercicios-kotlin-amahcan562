class Cafetera (val ubicacion: String){


    var capacidad : Int = 1000
    var cantidad : Int = 0

    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion) {
        this.cantidad = cantidad
        this.capacidad = capacidad
    }

/*  constructor(ubicacion: String, capacidad: Double, cantidad: Double, ) : this() */

    fun llenar() {
        cantidad = capacidad
    }

    fun servirTaza() {

    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(): Int {
        println("¿Qué cantidad de café deseas agregar? (en c.c.): ")
        var cantidadAgregar = 200
        cantidadAgregar= readln().toInt()

        println("Vas a agregar $cantidadAgregar c.c.")
        return cantidadAgregar
    }

    override fun toString(): String {
        return  ("Cafetera (ubicación = ${this.ubicacion}, capacidad = ${this.capacidad}c.c., cantidad = ${this.cantidad}c.c.)")
    }
}