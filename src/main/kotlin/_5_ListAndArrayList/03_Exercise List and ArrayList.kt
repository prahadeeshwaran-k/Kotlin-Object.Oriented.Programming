fun main(){
    val items = arrayListOf("Laptop","mouse","pen","paper","mug","phone")
    val removeItems = arrayListOf("pen","paper","mug","phone")
    items.removeAll(removeItems)
    println(items)
}