fun main(){
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("one","two","three"))

    val printer2 = Printer<Set<String>>()
    printer2.iterate(hashSetOf("1","2","3"))
}
class Printer<T:Collection<String>>{
    fun iterate(collection: T){
        collection.forEach{ println(it.toString()) }
    }
}