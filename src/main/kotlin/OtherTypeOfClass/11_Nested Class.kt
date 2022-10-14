fun main(){
val myCar = TheCar()
    myCar.Engine().run()
}
class TheCar{
    var speed = 123
    fun drive(){
        println("Driving At $speed")
    }
    inner class Engine{
        val rpm =300
        fun run(){
            this@TheCar.speed = 450
            this@TheCar.drive()
            println("Engin Running At a rpm of $rpm")
        }
    }
}