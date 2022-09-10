fun main(args: Array<String>){
    val math = Math()
    println("3 + 7 = ${math.add(3,7)}")
    println("3 + 7 = ${math.sub(3,7)}")
    println("3 + 7 = ${math.multi(3,7)}")
    println("3 + 7 = ${math.div(3,7)}")
}
class Math{
    fun add(a:Int,b:Int) = a+b
    fun sub(a:Int,b:Int) = a-b
    fun multi(a:Int,b:Int) = a*b
    fun div(a:Int,b:Int)  = a/b
}