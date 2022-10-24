fun main(){
    val chef =Chef<NewApple>()
    chef.cook(NewApple())

    val chef2 =Chef<Banana>()
    chef2.cook(Banana())
}

abstract class MyFruit{
    abstract fun peel()
}
class NewApple:MyFruit(){
    override fun peel() {
        println("Peeling the Apple")
    }
}
class Banana:MyFruit(){
    override fun peel() {
        println("Peeling the Banana")
    }
}
class Chef<T:MyFruit>{
    fun cook(item:T){
        item.peel()
    }
}