fun main(){
    var myCar = SportCar().apply{
        speed = 50
        colour = "Pink"
        startCar()
    }
}
class SportCar{
    var speed = 10
    var colour = "blur"
    fun startCar(){
        println("Starting The Car, Speed is $speed, coloue is $colour ")
    }
}