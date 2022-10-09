fun main(){
    //perform a block of code on an object
    with(CarOf()){
        speed = 76
        drive()
        println("Car is driving")
    }
}
class CarOf{
    var speed = 150
    fun drive(){
        println("Driving at $speed")
    }
}