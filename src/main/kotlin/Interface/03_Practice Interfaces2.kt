fun main(){
val factory  = CarFactory()
    val myCar:CarStudio = factory.provideCar()
    myCar.speed = 90
    myCar.drive()
    myCar.park()
}
interface CarStudio{
    var speed : Int
    fun drive()
    fun park()
}
class BmwCar:CarStudio{
    override var speed: Int = 250
    override fun drive() {
        println("Bmw is drive at $speed kph")
    }

    override fun park() {
        println("Bmw is Parked")
    }
}
class CarFactory{
    fun provideCar(): CarStudio {
        return BmwCar()
    }
}