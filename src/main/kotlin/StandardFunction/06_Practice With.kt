fun main(){
    val person = PersonInfo()
    with(person){
        firstName = "Jon"
        lastName = "Snow"
        age = 29
        printPersonInfo()
    }
}
class PersonInfo{
    var firstName = ""
    var lastName = ""
    var age = 0
    fun printPersonInfo(){
        println("FirstName is $firstName\nLastName is $lastName\nAge is $age\n")
    }
}