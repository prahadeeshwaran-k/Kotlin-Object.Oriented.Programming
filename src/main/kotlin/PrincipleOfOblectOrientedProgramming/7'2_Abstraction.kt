fun main(){

    val container:Containers = Bottels()
    container.pour()
}
abstract class Containers {
    abstract fun pour()

}
class Bottels: Containers(){
     fun fill(){
        println("filling bottel")
    }

    override fun pour() {
        println("poring")
    }
}
class Jugs : Containers(){
    override fun pour() {
        println("poring jug")
    }
}