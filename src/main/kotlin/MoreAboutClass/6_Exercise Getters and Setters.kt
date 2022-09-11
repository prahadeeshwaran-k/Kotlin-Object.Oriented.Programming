fun main(array: Array<String>) {
val account = BankAccountClass()
    account.amount = 1000
    account.amount = 500
    account.amount = 1200
    account.amount = 12000
}
class BankAccountClass{
    var interestRate = 0.0
    var amount:Int = 0
        get() = field
        set(value) {
            if(value<1000)
                interestRate = 1.0
            else if(value<10000)
                interestRate = 0.5
            else
                interestRate = 2.0
            field = value
            println("the clinte has $value and an interst rat of $interestRate")
        }

}