fun main(){
    val num1 = hashSetOf(1,2,3,4,5)
    val num2 = setOf(4,5,6,7,8)
    val result = num1.retainAll(num2)
    println(result)
    println(num1)
    num1.clear()
    println(num1)
    println(num1.isEmpty())

}