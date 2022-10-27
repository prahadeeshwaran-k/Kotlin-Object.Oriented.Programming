import kotlin.random.Random

fun main(){
    val list:List<Int> by lazy{generateList()}
    println("Should the list be Generated (Yes/No)")
    val input = readLine()?:""
    if (input == "yes")
        println(list)
}
fun generateList():List<Int>{
    val integers:ArrayList<Int> = arrayListOf<Int>()
    for (i in 1..1000)
        integers.add(Random.nextInt(1000))
    return integers
}