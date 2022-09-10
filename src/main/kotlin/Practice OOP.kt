fun main(args: Array<String>){
    var cat = Animal()
    cat.run()
    cat.name="Cat"
    cat.topSpeed = 40
    cat.run()
}
class Animal{
    var name  = "Animal's"
    var topSpeed = 0
    fun run (){
        println("$name'top speed is $topSpeed ")
    }
}