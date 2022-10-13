import kotlin.random.Random

fun main(){
    val prize = lottery()
    when(prize){
        is Vacation-> {
            println("I Have Holyday")
        }
        is Car9 -> {
            println("is Car")
        }
        is GiftCard -> {
            println("Gift CARD")
        }

        else -> {
            println()
        }
    }
}
fun lottery():Prized{
    val number:Int = Random.nextInt(3)
    return when(number){
        0-> FranceHoliday()
        1->  VW()
        else ->Doller100()
    }
}
sealed class Prized
sealed class  Car9:Prized()
sealed class Vacation:Prized()
sealed class GiftCard:Prized()

class VW: Car9()
class FranceHoliday:Vacation()
class Doller100:GiftCard()