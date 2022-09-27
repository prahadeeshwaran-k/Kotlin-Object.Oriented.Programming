import java.lang.Exception

fun main(){
    println("What product do you want to buy")
    val input1 = readLine()
    println("how Many would you like ?")
    val input2 = readLine()
    val price = 45.3
    try {
        val amount = input2?.toInt()
        println("$amount $input1 will cost ")
    }catch (e:Exception){
        println("cant read")
    }finally {
        println("it done")
    }
}