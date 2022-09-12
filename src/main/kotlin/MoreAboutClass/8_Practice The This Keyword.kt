fun main(array: Array<String>) {
var contentClass = Box()
    println("Contant is ${contentClass.content}")
    contentClass.updateContents("New update Content")
    println("Contant is ${contentClass.content}")
}
class Box{
    var content:String = ""
    fun updateContents(content:String){
        this.content = content
    }
}