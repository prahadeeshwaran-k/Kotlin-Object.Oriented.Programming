fun main(args:Array<String>){
    val translate= Translator()
        translate.sayHello()
        translate.sayHello("ta")
        translate.sayHello("hi")
        translate.sayHello("fr")
}
class Translator{
    fun sayHello(){
        println("Hello")
    }
    fun sayHello(language:String){
        when(language){
            "ta"-> println("Vanakkam")
            "hi"-> println("Namaste")
            "fr"-> println("bonjour")
            else -> println("Hello")
        }
    }
}