import java.lang.Exception

fun main(){
    println("Please enter a Number:")
    val input = readLine()
    try{
        val number = input?.toInt()
        println("$number * 5 = ${number?.times(5)}")
    }catch (e:Exception){
        println("the vaule $input is not a number")
        e.printStackTrace()
    }
}