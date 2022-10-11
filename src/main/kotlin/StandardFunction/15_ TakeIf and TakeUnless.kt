import kotlin.random.Random
//Take-if If an object is true it return
//Take-Unless If an object is false it return
fun main() {
    for (i in 1..5) {
        val number = Random.nextInt(100)
        val evevOrNull = number.takeIf { it % 2 == 0 }

        println("The number is $number")
        println("The even number is $evevOrNull")
    }
    println("-------------------")
    for (i in 1..5) {
        val number = Random.nextInt(100)
        val evevOrNull = number.takeUnless { it % 2 == 0 }

        println("The number is $number")
        println("The odd number is $evevOrNull")
    }

}