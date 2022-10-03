fun main(){
    val num = setOf(67,89,5,86,null)
    println(num.size)
    println(num.contains(67))
    println(num.contains(8))
    val numNo = setOf(67,null,5,86,89)
    println(num.containsAll(numNo))
}