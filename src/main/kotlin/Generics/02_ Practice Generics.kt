fun main(){
    val info  = Info<String>()
    info.getLength("My World")

    val info2 = Info<Double>()
    info2.getLength(235.54)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(1,2,3,4,5,78,9))
}
class Info<T>{
    fun getLength(item:T){
        println(item.toString().length)
    }
}