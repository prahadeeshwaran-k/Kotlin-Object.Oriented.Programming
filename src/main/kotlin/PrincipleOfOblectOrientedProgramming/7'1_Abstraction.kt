fun main(){
//val container:Container = Bottel()
//    container.pour()
//    container.fill() //error
val container:Bottel = Bottel()
    container.fill()
}
abstract class Container {
    fun pour(){
        println("poring liquid")
    }
}
class Bottel: Container(){
    fun fill(){
        println("filling bottel")
    }
}
class Jug : Container(){

}