fun main(){
    val myparakeert = Parakeert()
    myparakeert.fly()
}

open class Bird {
    open val colour = "Gray"
    open val speed  = 45

    open fun fly (){
        println("the colour of bird $colour and speed is $speed" )
    }
}
class Parakeert :Bird(){
    override val colour ="Green"
    override val speed  = 53
    override fun fly(){
        println("the colour of the bird is $colour and speed is $speed")
        print(super.colour)
    }
}
