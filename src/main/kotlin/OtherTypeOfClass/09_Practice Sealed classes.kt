fun main(){
    val myVehical = getVehical()
    when(myVehical){
        is Auto-> println("A Car is Faster")
        is Bike-> println("Is So Good SomeSpeed" )
    }
}
fun getVehical():Vehical = Splender()
abstract class Vehical
sealed class Auto:Vehical()
sealed class Bike:Vehical()

class Swift:Auto()
class Splender:Bike()
