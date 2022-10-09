fun main(){
    val NewCar = FreshCar().run{
        speed = 74
        drive()
        println("Is Driving")
        this
    }
    println("New Car")
    run {
        val car2 = FreshCar()
        car2.speed= 55
        car2.drive()
    }
}
class FreshCar{
    var speed=10
    fun drive(){
        println("Car is Driving at $speed")
    }
}