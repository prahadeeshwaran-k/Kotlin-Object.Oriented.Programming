fun main(){
    val colour = hashSetOf<String>()
    val colourList = hashSetOf<String>("Red","Green","Violet","Blue")
    colour.addAll(colourList)
    println(colour)
    colour.remove("Green")
    println(colour)
}
