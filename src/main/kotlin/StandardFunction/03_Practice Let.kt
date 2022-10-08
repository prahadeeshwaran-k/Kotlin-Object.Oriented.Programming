fun main(){
    val animals = arrayListOf<String>()
    for(i in 1..3){
        println("Input an Animal")
        val input:String? = readLine()
        input?.let {
            if (it == ""){
                animals.add(null.toString())
            }
            else {
            animals.add(it)
                }
            }

        }

    animals.forEach{
        println("Feeding the $it")
    }
}