fun main(){
    var myCoffeeShop = CoffeeShop()
    var myCoffee:Coffee? = null

    for(i in 1..5){
        myCoffee = myCoffeeShop.purchaseCoffee()
        myCoffee.quenckThirst()
        myCoffee.wakeUp()
    }
}
interface  Coffee{
    fun wakeUp()
    fun quenckThirst()
}
class Arabica:Coffee{
    override fun wakeUp() {
        println("waking you up with some arabica")
    }

    override fun quenckThirst() {
        println("quenching your Arabic Thirst")
    }
}
class Robusta : Coffee{
    override fun wakeUp() {
        println("Robusta Will Walke you up")
    }

    override fun quenckThirst() {
    println("robusta will quench your thrust for coffee")
    }

}
class CoffeeShop{
    fun purchaseCoffee():Coffee{
        val randomNumber :Long = System.currentTimeMillis()
            if (randomNumber % 2 == 0L){
                return Arabica()
            }
        else
            return Robusta()
    }
}