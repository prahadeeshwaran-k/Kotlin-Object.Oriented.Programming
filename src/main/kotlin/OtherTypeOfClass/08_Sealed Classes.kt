fun main(){
    val somePlant = getPlant()
    when(somePlant){
        is Fruit -> println("Sweet fruit")
        is Vegetable -> println("Tasty Vegatable")
    }
}
fun getPlant():Plant = Mango()

abstract class Plant

sealed class Fruit:Plant()
sealed class Vegetable:Plant()

class Mango: Fruit()
class Potato:Vegetable()