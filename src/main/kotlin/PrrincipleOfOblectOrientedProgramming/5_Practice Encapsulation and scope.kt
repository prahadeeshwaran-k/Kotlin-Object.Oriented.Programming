fun main(){
val mylock = EncriptionLock(40)
    println("Dose The Key 70 Unlock My Lock: ${mylock.unlock(70)}")
    println("Dose The Key 50 Unlock My Lock: ${mylock.unlock(50)}")

}
class EncriptionLock(private val privateKey:Int){
    public fun unlock(publicKey:Int) = formula(publicKey)== privateKey

    fun formula(publicKey: Int) = publicKey/2+5
}