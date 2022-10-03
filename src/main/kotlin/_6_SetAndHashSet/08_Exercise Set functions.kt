fun main(){
    val acceptedColour = hashSetOf("white","black","grey")
    val myColour = hashSetOf("blue","red","black","green")
    acceptedColour.retainAll(myColour)
    println("i can only wear $acceptedColour")

}