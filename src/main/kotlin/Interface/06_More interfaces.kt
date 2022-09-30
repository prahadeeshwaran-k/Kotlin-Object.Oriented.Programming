fun main(){
val Dealer = CarDealer()
    var myCar:NewCar =Dealer.rentAffordableCar()
    myCar.rent()
    myCar = Dealer.rentLuxuryCar()
    myCar.rent()
}
interface NewCar{
    var price:Int
    fun rent()
}
class AffordiableCar: NewCar{
    override var price: Int = 1000
    override fun rent() {
         println("The affordiable car Cost 1000")
    }
}
class LuxuryCar:NewCar{
    override var price:Int = 5000
    override fun rent() {
        println("This is Luxury Car 5000")    }
}
class CarDealer{
    fun rentAffordableCar(): NewCar {
        return AffordiableCar()
    }
    fun rentLuxuryCar():NewCar{
        return LuxuryCar()
    }
}