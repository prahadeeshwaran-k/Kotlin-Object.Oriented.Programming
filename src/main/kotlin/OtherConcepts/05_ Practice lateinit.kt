fun main(){
    val myContry = MyCountry().apply { setName("Sweden") }
    println("hello ${myContry.getName()}")
}
class MyCountry{
    private lateinit var name: String
    fun setName(name:String){
        this.name = name
    }
    fun getName() = name
}