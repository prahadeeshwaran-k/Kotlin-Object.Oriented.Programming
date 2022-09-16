fun main(args: Array<String>) {
    val mother =  Mom("Hindi")
    mother.say("go to study")
    val tony = Daughter("Tamil")
    tony.say(" ho no")
    println(tony.hairColor)
}
open class Mom(nativeTongue:String){
    open val hairColor: String = "Black"
    val eyeColor: String = "White"

    open fun say(message: String){
        println("Mom Says $message")
    }
}
class Daughter(nativeTongue: String):Mom(nativeTongue){
    override val hairColor = "Blond"
    override fun say(message:String) {
        println("Daughter Say $message")
        super.say(message)
        println("mother Say ${super.hairColor}")
    }

}