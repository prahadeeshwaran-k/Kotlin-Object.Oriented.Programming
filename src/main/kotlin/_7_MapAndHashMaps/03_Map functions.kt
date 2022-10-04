fun main(){
    var count = mapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
    println("this map have a the size of: ${count.size}")
    println("this map have a the key 2 ? : ${count.containsKey(2)}")
    println("this map have a the key 5 ? : ${count.containsKey(5)}")
    println("this map have a the value \"two\" ? : ${count.containsValue("two")}")
    println("this map have a the value \"five\" ? : ${count.containsValue("five")}")

}