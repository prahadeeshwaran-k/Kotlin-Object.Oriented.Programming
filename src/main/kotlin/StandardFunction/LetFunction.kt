fun main(){
    //Let us a keyword which Executive when the object is not null
    // Allows us to run code on an object
    //we can access the result as a lambda argument it by default
    var animals = listOf("Cat","Dog","Mouse","Zebra","Bear")
    animals.map { it.length }
            .filter { it>3 }
//                .let {
//                   println(it)
//                   println("Size of list is ${it.size}")
//                  }
//if the Block of Code a Single function call we can use method reference::
        .let (::println )

//let is used for a function or a class is non null
    var name = readLine()
    name?.let {
        println("your name is $it")
    }
}