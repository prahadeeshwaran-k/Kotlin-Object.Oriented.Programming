fun main(array: Array<String>) {
    var laptopOS = Laptops("windows 11")
}
class Laptops(var operatingSystem:String){
    init {
        println("The operating System $operatingSystem Has been installing ")
    }
}