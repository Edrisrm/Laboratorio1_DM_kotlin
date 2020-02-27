import avion.AvionI

class Aeropuerto(avion: AvionI) {
    var avion: AvionI = avion
    public fun takeInOff() {
        println("saliendo " +avion.Tipo())
    }
}