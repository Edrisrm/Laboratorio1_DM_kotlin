package carro

abstract class Carro{
    abstract fun tipo(): String

    final fun imprimir() {
        println("Soy un carro de tipo:" + tipo())
    }
}