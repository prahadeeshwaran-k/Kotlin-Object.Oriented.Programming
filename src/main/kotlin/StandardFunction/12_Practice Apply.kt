fun main(){
    Locks().unlock{
        Keys().apply{
            SerectCode = "4272"
            carve()
        }
    }
}
class Locks{
    fun unlock(keys: () -> Keys){
        println("Unlock lock with Key $keys")
    }
}
class Keys{
    var SerectCode =""
    fun carve(){
        println("Carving  the key with code $SerectCode")
    }
}