//overriding a class

fun main(){
    val Moms = MoM()
    val idaughter  = DaughterInLaw()

    Moms.say("IT is Me")
    idaughter.say("HELLO")
}
open class MoM(){
    open fun say(message:String){
        println("Mom Say $message")
    }
}
class DaughterInLaw: MoM(){
    override fun say(message: String){
        println("Daughter In Law Say $message")
    }
}