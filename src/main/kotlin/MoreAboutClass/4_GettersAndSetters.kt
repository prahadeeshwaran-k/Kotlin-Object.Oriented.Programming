fun main(array: Array<String>) {
    val myCar = CarInfo()
    myCar.fast = 100
    println("car.name ${myCar.name}")
    println("car.speed ${myCar.fast}")
}
class CarInfo {
    var name = ""
    var fast:Int
        get() = 50
        set(value) {name = "High Speed Super Car $value"}
}

