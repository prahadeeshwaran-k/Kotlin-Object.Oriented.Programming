fun main(){
    //Array List is Mutable(Changeable) List
    var Colour:ArrayList<String>  = arrayListOf("Red","Green","Yellow")
    println(Colour)
    val Empty = arrayListOf<Int>()
    println(Empty)
    Colour.add("Gray")
    println(Colour)
    //Adding a another Collection of List
    var Colour2 = arrayListOf<String>("Pink","Blue")
    Colour.addAll(Colour2)
    println(Colour)
    //Remove An Element From A List
    Colour.remove("Blue")
    println(Colour)
    //Remove Element by index
    Colour.removeAt(2)
}