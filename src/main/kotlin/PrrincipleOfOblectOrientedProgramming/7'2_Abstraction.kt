fun main(){

    val container:Container = Bottel()
    container.pour()
}
abstract class Containers {
    abstract fun pour()

}
class Bottel: Containers(){
    override fun fill(){
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