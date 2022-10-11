fun main(){
    Book().apply {
        printBook()
    }.also{
        println("Printing book $it")
        println("Sending an Email book $it")
    }
}
class Book{
    fun printBook(){
        println("Printing a Book")
    }
}