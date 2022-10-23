fun main(){
    val myBox = Boxing<String>()
    myBox.display("Hello")

    val carBox =Boxing<CarBoxing>()
    carBox.display(CarBoxing())

    val newBox = NewBox<Int,Float>()
    newBox.display(12,54.5F)
}
class Boxing<T>{
    fun display(item:T){
        println(item)
    }
}

class NewBox<T,U>{
    fun display(item:T,item2:U){
        println(item)
        println(item2)
    }
}

class CarBoxing{

}