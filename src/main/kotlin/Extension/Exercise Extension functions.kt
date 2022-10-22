fun main(){
    val list  = arrayListOf(74,4,32,6,9,3,8,2)
    println(list.howMany())
}
fun ArrayList<Int>.howMany() = "this list Contains $size element "