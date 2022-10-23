fun main(){
    val type = Type<Int>()
    type.printMessage(234)
}
class Type<T>{
    fun printMessage(item: T){
        println("this is converted to String ${item.toString()}")
    }
}