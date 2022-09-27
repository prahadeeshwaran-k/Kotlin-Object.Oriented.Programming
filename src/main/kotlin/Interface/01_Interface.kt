fun main(){
    val myOven: Oven? = null
    myOven?.turnOn()
    myOven?.cook(120)
    myOven?.turnOf()
}
interface Oven {
    val temperature:Int
    fun turnOn()
    fun turnOf()
    fun cook(temp:Int){
        println("Cooking at $temp degrees")
    }

}