fun main(){
    var animals  = arrayListOf<String>("lion","zebra","chimp","elephant")
    animals.add("panda")
    println(animals)
    animals.remove("lion")
    println(animals)
    val compare = listOf("elephant","giraffe")
    val animalHave = animals.containsAll(compare)
    println("Dose The Animal Have : $animalHave")
}