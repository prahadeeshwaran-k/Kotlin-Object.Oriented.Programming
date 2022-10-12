fun main(){
    val myUser1 = UserId("Prahadeeshwaran","Prahadees@mymail.in","pHJ573$^")
    val myUser2 = UserId("Prahadeeshwaran","Prahadees@mymail.in","pHJ573$^")
    println(myUser1==myUser2)
    val myUser3 = myUser1.copy(name = "Vanakkam")
    println(myUser3)
}
data class UserId(
    val name:String,
    val email:String,
    val password:String
)
