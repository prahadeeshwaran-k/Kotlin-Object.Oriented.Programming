fun main(){
val child = Child()
    child.raisePets()
}
interface Pets{
    var cutness: Int
    fun startplay()
    fun feed()
}
class Puppy:Pets{
    override var cutness = 10

    override fun startplay() {
        println("running,jump,bark")
    }

    override fun feed() {
        println("Given doggy food")
    }

}
class Child{
    var pet:Pets
    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }
    fun raisePets(){
        for (i in 1 ..pet.cutness){
            pet.startplay()
        }
        pet.feed()
    }
}
class PetStore{
    fun getPet():Pets{
        return Puppy()
    }
}