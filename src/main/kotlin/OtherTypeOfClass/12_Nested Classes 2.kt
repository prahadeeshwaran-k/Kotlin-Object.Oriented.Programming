fun main(){
    val myCar = TheCar2()
    myCar.drive()
}
class TheCar2{
    private val engine = Engine()
    var speed = 123
    fun drive(){
        engine.run()
        println("Driving At $speed")
    }
    private inner class Engine{
        val rpm =300
        fun run(){
            this@TheCar2.speed = 450
            println("Engin Running At a rpm of $rpm")
        }
    }
}