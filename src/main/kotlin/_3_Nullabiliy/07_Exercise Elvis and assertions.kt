fun main(){
    val price = 29.99
    println("no of product: ")
    val input = readLine()
    val product = input?.toInt()?:3
    println("Total is ${product.times(price)} ")
}