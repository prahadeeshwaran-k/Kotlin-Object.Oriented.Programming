fun main(){

}
open class Airplane01 {
   internal val type = "AirBus"
   internal fun fly(){
        println("flying")
    }
}
class MyAirplane :Airplane01(){
    fun takeOff(){
        println(type)
        fly()
    }
}
class  MyCar01(){
    fun start(){
        val airplane = Airplane01()
        println(airplane.type)
        airplane.fly()
    }
}