fun main(){
    //as? is null Safe
    val myCar:Car0 = getCar0()
    if(myCar is Bmw1){
        (myCar as Bmw1).drive()
    }
}
open class Car0{}
class Bmw1:Car0(){
    fun drive(){
        println("is Driving")
    }
}
fun getCar0():Car0 =  Bmw1()