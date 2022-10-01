fun main(){
    var colours = arrayListOf<String>("blue","red","green","Yellow")
    colours.set(2,"pink")
    println(colours)
    val subColor = colours.subList(0,1)
    println(subColor)

    colours.clear()
    println(colours)
}