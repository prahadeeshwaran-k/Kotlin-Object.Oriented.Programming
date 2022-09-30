fun main(){
val animals = arrayListOf<String>("dog","cat","horse","tiger","fox")
    println(animals.size)
    println(animals[2])

    var customer = arrayListOf<String>("Alex","John","Michelle","Jons")
    val newcustomer = "Stark"
    val Leavingcustomer = "Banner"
    println( customer.add(newcustomer))
    println(customer.remove(Leavingcustomer))
}