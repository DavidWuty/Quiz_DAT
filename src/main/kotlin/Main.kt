package org.example

// Clase abstracta que representa un Vehículo (Abstracción)
abstract class Vehicle {
    // Propiedad privada (Encapsulamiento)
    private var speed: Int = 0

    // Método abstracto (Abstracción) que debe implementarse en la clase derivada
    abstract fun fuelType(): String

    // Métodos públicos para acceder a la propiedad privada (Encapsulamiento)
    fun getSpeed(): Int {
        return speed
    }

    fun setSpeed(newSpeed: Int) {
        if (newSpeed >= 0) {
            speed = newSpeed
        }
    }

    // Método que puede ser sobrescrito en la subclase (Polimorfismo)
    open fun startEngine() {
        println("El motor del vehículo está arrancando...")
    }
}

// Clase derivada que representa un Coche, hereda de Vehicle (Herencia)
class Car : Vehicle() {
    // Implementación del método abstracto (Abstracción)
    override fun fuelType(): String {
        return "Gasolina"
    }

    // Sobrescritura del método (Polimorfismo)
    override fun startEngine() {
        println("El motor del coche está arrancando con gasolina...")
    }
}

// Función principal para probar las clases
fun main() {
    // Creación de una instancia de la clase Car
    val myCar = Car()

    // Uso de los métodos getter y setter para la propiedad encapsulada
    myCar.setSpeed(100)
    println("La velocidad del coche es: ${myCar.getSpeed()} km/h")

    // Uso del método sobrescrito
    myCar.startEngine()

    // Llamada al método abstracto implementado en la subclase
    println("Tipo de combustible: ${myCar.fuelType()}")
}
