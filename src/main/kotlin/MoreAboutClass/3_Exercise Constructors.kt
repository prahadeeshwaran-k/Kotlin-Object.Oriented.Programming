fun main(array: Array<String>) {
    val user1 = UserAccount()
    val user2 = UserAccount("Steve")
    val user3 = UserAccount("Tony Stark",100000)
    val user4 = UserAccount("Anna",5000)
}
class UserAccount{
    constructor(){
        userName = "Generic user"
        balance = 1
        canAfford()
    }
    constructor(newUsername:String){
        userName = newUsername
        balance = 2
        canAfford()
    }
    constructor(newUsername: String,newBalance:Int){
        userName = newUsername
        balance = newBalance
        canAfford()
    }
    var userName = "UserName"
    var balance = 0
    val tshirtPrice = 20
     fun canAfford(){
         if (balance>tshirtPrice){
             println("$userName can afford ${balance/tshirtPrice} T-shirt")
         }else{
             println("$userName can't afford T-shirt")
         }
     }

}