fun main(){
    val number = setOf<Int>(34,67,2,5,245,3256,76)
    println(number.filter { it in 10..99 })// >= 10 && it < 100
    val clien = listOf("Mark","tom","henry","holland")
    println(clien.sortedBy { it[it.length-1] })
    val ints = listOf(372,123,795,469,945,110)
    println(ints.maxBy { it.toString()[1].toInt() })
    println(ints.maxBy { it/10%10 })
}