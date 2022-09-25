fun main(){
    var catName: String? = "Chonkers"
    println(catName?.length?.toString())
    catName = null
    //Compiler error
    //catName.length
    println(catName?.length?.toString())
}