fun main(){
    val colours = listOf<String>("blue","red","green")
    println(colours.size)
    println(colours.contains("blur"))
    println(colours.contains("pink"))
    val colours2= listOf<String>("red","blue")
    println(colours.containsAll(colours2))
    println(colours.indexOf("red"))
}
