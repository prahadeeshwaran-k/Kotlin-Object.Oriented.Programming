fun main(array: Array<String>) {
    val account = BankAccount()
    account.account = 3000
    account.account = 4000
    account.account = 100
}
class BankAccount{
    var creditRating = 500
    var account:Int = 0
        get() = field
        set(value) {
            if(value > account)
                creditRating++
            else
                creditRating--
            field = value
            println("New credit rating is $creditRating")
        }
}
