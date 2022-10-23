fun main(){
val name = "Vankkam"
    println(name.Slim())
}
//Don't do
//fun String.Slim() = this.substring(1,length-1)
fun String.Slim():String{
    return this.substring(1,length-1)
}