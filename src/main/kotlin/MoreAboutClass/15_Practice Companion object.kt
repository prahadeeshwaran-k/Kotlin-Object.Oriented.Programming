import kotlin.random.Random

fun main(array: Array<String>) {
    val correctKey:Key = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey:Key = Lock.createKey()
    myLock.unlock(randomKey)
}
class Lock(key: Key){
    var secretCode: String
    init {
        secretCode = generateSecret()
        Key.secretCode = secretCode
    }

    companion object{
        fun createKey() = Key()
    }
    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }
    fun unlock(key: Key){
        if (key.secretCode == secretCode)
            println("lock is open")
        else
            println("Key is not correct")
    }
}

class Key{
    var secretCode:String = ""
    set(value) {
        if(field == "")
            field == value
        }

    companion object {
        lateinit var secretCode: String
    }

}