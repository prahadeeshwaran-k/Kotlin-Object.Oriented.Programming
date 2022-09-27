fun main(){
    val myOven: Oven = BoschOven()
    myOven.turnOn()
    myOven.cook(120)
    myOven.turnOff()
}
interface Oven {
    val temperature:Int
    fun turnOn()
    fun turnOff()
    fun cook(temp:Int){
        println("Cooking at $temp degrees")
    }
}
class BoschOven: Oven {
    override val temperature = 100

    override fun turnOn(){
        println("Turning On")
    }

    override fun turnOff() {
        println("Turing Off")
    }
}