fun main(){
    var myRestaurant = Franchise()
    myRestaurant.prepareBurgers()

}
open class OriginalRestaurant{
    protected fun applyFormula():String{
        return "Prepare burgers with love and care"
    }
}
class Franchise: OriginalRestaurant(){
    fun prepareBurgers(){
        println("Preparing burgers Accordind to th secret formula")
        println(applyFormula())
    }
}