import avion.Avioneta
import avion.Jet
import carro.*


fun main(){
    println("Metodos de carro")
    ejecutarCarro()
    println("----------------")
    println("Metodos de avion")
    ejecutarAvion()
}

     fun ejecutarAvion(){
        var aeropuerto = Aeropuerto(Jet())//en mi interfaz de aeropuerto inyecta todos los metodos sobreescritos de Jet
         aeropuerto.takeInOff()
         aeropuerto = Aeropuerto(Avioneta())
         aeropuerto.takeInOff()
    }

 fun ejecutarCarro(){
    var car : Carro
    car = Sedan()
    println(car.tipo())
    println(car.imprimir())
    car = Suv()
    println(car.tipo())
    println(car.imprimir())
}