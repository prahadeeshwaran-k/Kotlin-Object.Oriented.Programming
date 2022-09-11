fun main(args: Array<String>){
 var jetpack = Jetpack()
    jetpack.burn(30)
    println("User Height is ${jetpack.userHeight}")
    jetpack.stop(4)
    println("User Height is ${jetpack.userHeight}")
    jetpack.burn(2)
    println("User Height is ${jetpack.userHeight}")
    jetpack.stop(7)
    println("User Height is ${jetpack.userHeight}")

}
class Jetpack{
    var userHeight = 0

    fun burn(seconds:Int){
        println("Burning for $seconds Seconds")
        userHeight += seconds
    }
    fun stop(seconds: Int){
        println("Stoping for $seconds Seconds ")
        userHeight -= 3*seconds
        if(userHeight < 0){
            userHeight = 0
        }
    }

}