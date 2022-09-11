fun main(args: Array<String>) {
    var boeing747 = Boiend()
    var a320 = Airbus()

    boeing747.speed = 700
    a320.speed = 798

    boeing747.name = "Boeing747"
    a320.name = "A320"

    boeing747.ascent()
    a320.descend()
    boeing747.descend()
    a320.ascent()
    a320.ascent()
    boeing747.descend()
}
open class Airplane{
    var name = "General Airplain"
    var speed  = 1000
    var altitude = 20000

    fun ascent(){
        altitude+=1000
        println("$name has an altitude of $altitude and speed of $speed")
    }
    fun descend(){
        altitude-=1000
        println("$name has an altitude of $altitude and speed of $speed")

    }
}

class Boiend: Airplane(){

}
class Airbus: Airplane(){

}
