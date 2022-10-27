import kotlin.random.Random

fun main(){
    val message:String by lazy{
        "Some large value"
    }
    if (Random.nextInt()%2==0)
        println(message)
}
