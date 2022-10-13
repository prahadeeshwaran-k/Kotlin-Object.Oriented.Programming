//Define a Collection of Constant
//The Constant define are object
//The Constant have properties
fun main(){
    val colour = Colour.Red
        when(colour){
            Colour.Red-> println("Colour is Red")
            Colour.Blue-> println("Colour is Blue")
            Colour.Green-> println("Colour is Green")
        }
    println(Colour2.Red.TimesUsed)
    println(Colour2.Blue.name)
    println(Colour2.Green.ordinal)

}
enum class Colour{
    Red,
    Green,
    Blue
}
enum class Colour2(val TimesUsed:Int){
    Red(54),
    Green(25),
    Blue(65)
}