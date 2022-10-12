fun main(){
    val myUser = UserIdData("Prahadeeshwaran","Prahadees@mymail.in","pHJ573$^")
    println(myUser)
}
data class UserIdData(
    val name:String,
    val email:String,
    val password:String
)