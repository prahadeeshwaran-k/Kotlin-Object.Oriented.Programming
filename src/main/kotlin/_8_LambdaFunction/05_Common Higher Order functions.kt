fun main(){
    var clints = listOf<String>("Anna","Adam","Bob","Carol","David")
        clints.forEach{println("Hello $it") }

        clints.filter { it.length< 5}
            .forEach{println("Smaller than 5 $it")}

    val sizes:List<Int> = clints.map { it.length }
    println(sizes)
    val sorted = clints.sortedBy { it.length }
    println(sorted)
    val Max = clints.maxBy { it.length }
    println(Max)
    val Min = clints.minBy { it.length }
    println(Min)
}
