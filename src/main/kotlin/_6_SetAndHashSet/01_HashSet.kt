fun main(){
    //if this only for duplicate variable is there
    val numbers = hashSetOf(3,7,null,7,5)
    val emptySet = hashSetOf<Int>()
    println(numbers)
    println(emptySet)
    numbers.add(44)
    println(numbers)
    val numNumber = setOf(54,76,23)
    numbers.addAll(numNumber)
    println(numbers)
    numbers.remove(54)
}

