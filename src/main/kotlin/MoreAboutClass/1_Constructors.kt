fun main(args: Array<String>) {
    val myCar = Cars()
    val yourCars = Cars("Tesla")
    val himCar = Cars("Ford",786)

    myCar.ShowCar()
    yourCars.ShowCar()
    himCar.ShowCar()

}
//class Cars(var model :String ,var topSpeed:Int){
//}
class Cars{
    constructor(){
        model = "No model"
        topSpeed = 150
    }
    constructor(newModel:String){
        model = newModel
        topSpeed = 150
    }
    constructor(newModel: String,newSpeed:Int){
        model = newModel
        topSpeed = newSpeed
    }
    var model:String? = null
    var topSpeed = 100

    fun ShowCar(){
        println("the car model $model have a top speed of $topSpeed")
    }
}