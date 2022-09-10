
fun main(array: Array<String>){
    class Car{

        var model:String? = null
        var topSpeed = 100

        fun start(){
            println("Starting The $model")
        }

        fun drive(speed:Int){
            print("Driver at a speed od $speed")
        }


    }
}