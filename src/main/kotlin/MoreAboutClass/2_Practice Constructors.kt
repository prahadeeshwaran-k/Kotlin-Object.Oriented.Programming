fun main(array: Array<String>) {
    val table1 = Table()
    val table2 = Table(2)
    val table3 = Table(6,56)
    table1.printInfo()
    table2.printInfo()
    table3.printInfo()

}

class Table{
    var legs = 4
    var height = 120
    constructor(){
        legs = 3
        height = 120
    }
    constructor(newLeg:Int){
        legs = newLeg
        height = 165
    }
    constructor(newLeg:Int,newHeight:Int){
        legs = newLeg
        height = newHeight
    }
    fun printInfo(){
        println("This table has $legs and a height of $height")
    }
}
