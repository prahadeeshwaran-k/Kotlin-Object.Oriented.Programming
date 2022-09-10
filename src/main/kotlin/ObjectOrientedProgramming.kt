
fun main(array: Array<String>){
    val myCar:Car = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(89)

    yourCar.start()
    yourCar.drive(67)
}


class Car{
    var model:String? = null
    var topSpeed:Int = 100

    fun start(){
        println("Starting The $model")
    }

    fun drive(speed:Int){
        print("Driver at a speed od $speed\n")
    }
}