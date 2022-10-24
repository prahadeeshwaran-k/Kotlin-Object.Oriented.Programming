fun main(){
    val value = "Hello"
    //Opposite of !is
    if(value is String) {
        println("Length is ${value.length}")
    }
    val myCar:Car7= getCar()
    if(myCar !is Bmw){
        println("It is not a favorite Car Brand")
    }
}
open class Car7{}
class Bmw:Car7(){}
fun getCar():Car7 = Car7()