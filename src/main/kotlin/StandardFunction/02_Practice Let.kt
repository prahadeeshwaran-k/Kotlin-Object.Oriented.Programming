fun main(){
    println("Enter a number")
    val input = readLine()
    input?.let {
        val number = it.toInt()
        println("The Double of number is ${2*number}")
    }
}