fun main(array: Array<String>) {
    var notes = Notes()
    println(notes.message)
    notes.printMessage()
    notes.updateMessage("Hello it new")
    println(notes.message)

}
class Notes{
    var message :String = "No Message"

    fun updateMessage(message:String){
        this.message = message
    }

    fun printMessage(){
        println(this.message)
    }
}