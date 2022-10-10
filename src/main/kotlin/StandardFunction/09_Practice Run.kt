fun main(){
        val shop = Restaurent().run {
            standardDish = "Sambar"
            todayDish = "Pro+ Sambar Ultra Max"
            printMenu()
            this
        }
    println(shop)
}
class Restaurent{
    var standardDish = ""
    var todayDish = ""
    fun printMenu(){
        println("the Standard Dish is $standardDish")
        println("the Today Dish is $todayDish")
    }

}