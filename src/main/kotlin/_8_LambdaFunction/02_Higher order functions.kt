//A HOF is a function that takes another function as a parameter
fun main(){
    val names = arrayListOf("alice","bob","carol","dan")
    val myLambda = {name:String ->println("hello $name")}
    sayHello(names,myLambda)
}
 fun sayHello(names:ArrayList<String>,doSomething:(String)->Unit){
    for (name in names){
        doSomething(name)
    }
 }