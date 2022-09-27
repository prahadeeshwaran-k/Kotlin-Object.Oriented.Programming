fun main(){
    val test = readLine()
    try {
        println(test?.toInt())
    }catch (e:Exception){
        println("Some Exception Happened\n${e.localizedMessage}")
        e.printStackTrace()
    }finally {
        println("finally execution has completed")
    }

}
