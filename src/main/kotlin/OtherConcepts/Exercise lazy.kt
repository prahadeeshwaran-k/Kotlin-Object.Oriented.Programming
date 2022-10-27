fun main(){
    val newUser:NewUser by lazy{NewUser()}
    val banned = listOf("Alice","Bob","Carol","")
    println("please enter a user")
    val input:String = readLine()?:""
    if (!banned.contains(input))
        newUser.printWelcome()
}
class NewUser{
    fun printWelcome(){
        fun printWelcome(){
            println("welcome to the course")
        }
    }
}