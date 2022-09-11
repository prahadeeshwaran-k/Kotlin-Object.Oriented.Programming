fun main(args: Array<String>){
var calculator = Calculator()
    calculator.add(78.6)
    calculator.sub(23.6)
    calculator.mul(87.9)
    calculator.div(2.0)
    calculator.reset()
}
class Calculator{
    var total = 0.0
    fun add(a: Double){
        total += a
        println("+ $a")
        println("= $total")
    }
    fun sub(a: Double){
        total -= a
        println("+ $a")
        println("= $total")
    }
    fun mul(a: Double){
        total *= a
        println("* $a")
        println("= $total")
    }
    fun div(a: Double){
        total /= a
        println("/ $a")
        println("= $total")
    }
    fun reset(){
        total = 0.0
        println("restart")
    }
}