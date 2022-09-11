fun main(args: Array<String>){
    val myLaptop = Laptop()
    val myapple = Apple()
    myapple.screenSize = 13
    myapple.name = "Apple macbook ultra"

    myLaptop.run()
    myapple.run()

}
open class Laptop{
    var screenSize = 15
    var speed =1200
    var name = "Acer"
    fun run(){
        println("running laptop $name with screen size $screenSize and speed is $speed")
    }
}
class Apple :Laptop(){

}