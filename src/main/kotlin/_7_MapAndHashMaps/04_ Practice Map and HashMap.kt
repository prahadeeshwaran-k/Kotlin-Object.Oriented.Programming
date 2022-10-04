fun main(){
    var count = hashMapOf(Pair(1,"Kon'nichiwa"), Pair(2, "Vaṇakkam"))
    println("Hello in japanese is ${count[1]}")
    println("Hello in Tamil is ${count[2]}")

    val customer = hashMapOf(Pair("john",1),Pair("Alice",5),Pair("Bob",3))
    println("Is Alice a Customer ? : ${customer.containsKey("Alice")}")
    println("Alice brought ${customer.get("Alice")} product")
}