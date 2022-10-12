fun main(){
    val customers = arrayListOf<CustomerInfo>()
    customers.add(CustomerInfo("Alice","alice@mail.in",4))
    customers.add(CustomerInfo("Bob","Bob@mail.in",7))
    customers.add(CustomerInfo("Carol","carol@mail.in",2))
    println(customers)
    val newCustomer:CustomerInfo = customers[1].copy(email = "newBob@gmail.com")
    customers.add(newCustomer)
    SendEmail(customers)
}
fun SendEmail(customer:ArrayList<CustomerInfo>){
    customer.forEach { println("sending a mail to ${it.email}") }
}
data class CustomerInfo(
    val name:String,
    val email:String,
    val productBought:Int
)