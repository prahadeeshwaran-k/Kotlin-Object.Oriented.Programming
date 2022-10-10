fun main(){
    val Laptop = MyLaptop().run {
        turnOff()
        turnOn()
    }
}
class MyLaptop{
    fun turnOff(){
        println("Turning Laptop OFF")
    }
    fun turnOn(){
        println("Turning Laptop ON")
    }
}