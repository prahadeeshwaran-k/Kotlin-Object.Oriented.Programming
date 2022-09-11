fun main(args: Array<String>){
    val myDog = SubDog()
    myDog.size = 10
    println(myDog.size)
    myDog.play()
    myDog.bark()
}
open class Dog{
    var size: Int = 0

    fun bark(){
        println("Bark")
    }
    fun play(){
        println("Playing")
    }
}
class SubDog:Dog(){

}