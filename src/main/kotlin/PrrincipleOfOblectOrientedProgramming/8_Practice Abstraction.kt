fun main(){
 val mydog = Pug("pug")
 val yourDog = BassetHound("bassetHound")
 val himDog  = Chihuahua("Chihuahua")
    mydog.bark()
    mydog.run()
    mydog.play()

    yourDog.bark()
    yourDog.run()
    yourDog.play()

    himDog.bark()
    himDog.run()
    himDog.play()

}
abstract class Dogs(name: String){
    abstract fun run()
    abstract fun bark()
    abstract fun play()

}
class Pug (val name:String):Dogs(name){
    override fun run() {
        println("a $name Can run")
    }

    override fun bark() {
        println("a $name Can play")
    }

    override fun play() {
        println("a $name Can't bark")
    }
}
class BassetHound(val name: String):Dogs(name){
    override fun run() {
        println("a $name Cannot run")
    }

    override fun bark() {
        println("a $name Can Play")
    }

    override fun play() {
        println("a $name Can Bark")
    }

}
class Chihuahua(val name:String):Dogs(name){
    override fun run() {
        println("a $name Can run")
    }

    override fun bark() {
        println("a $name Can Play")
    }

    override fun play() {
        println("a $name Cannot Bark")
    }

}