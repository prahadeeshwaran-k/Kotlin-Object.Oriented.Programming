fun main(){
    Car2().apply {
        buildCar()
    }.also {
        println("LOG :Build The Car $it")
        println("Sending a Message to an Police 4 has been Build")
    }
}
class Car2{
    fun buildCar(){
        println("Building a Car")
    }
}