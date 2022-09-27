fun main(){
    val myOven:DefaultOven = Bosch()
    val myRoster:DefaultOven =  Roster()
    myOven.Cooking()
    myRoster.Cooking()
}
abstract class DefaultOven{
    val cookingSpeed=  120
    open val averageTemperature  = 180
    abstract fun Cooking ()
}
class Bosch: DefaultOven() {
    override val averageTemperature = 205
    override fun Cooking(){
        println("Bosch oven cooking in $cookingSpeed minutes at $averageTemperature Temperature")
    }
}
class Roster:DefaultOven(){
    override fun Cooking() {
println("A Roster roaster at $averageTemperature for ${cookingSpeed} minutes")    }

}
