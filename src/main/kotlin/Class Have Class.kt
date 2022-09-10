fun main(args: Array<String>){
    var myCarGarage = Garage()
    println("${myCarGarage.car.drive()}")
}

class MyCar{
    fun drive(){
        println("Drive alone in my car")
    }
}
class Garage{
    var car = MyCar()
}