fun main(){
val me = Son()
    me.printName()
}
open class Father {
    open val firstName = "JOHN"
    open val lastName = "WATTS"

    open fun printName(){
        println("name is $firstName $lastName")
    }
}
class Son :Father(){
    override val firstName = "TESLA"
    override fun printName() {
        super.printName()
        println("Father name is ${super.firstName} ${super.lastName}")
    }
}