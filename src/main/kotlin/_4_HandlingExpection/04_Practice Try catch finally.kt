import java.lang.Exception

fun main(){
    println("please enter the distance of kilo meter:")
    val input = readLine()
    try {
        val distance = input?.toInt()
        println("$distance KM is ${distance?.times(0.62)} Miles")
    }catch (e:Exception){
        println("Cannot Read Distance")
        e.printStackTrace()
    }
}