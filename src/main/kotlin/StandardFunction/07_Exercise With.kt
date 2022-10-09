fun main(){
    with(Store()){
        shoes =7
        shirts=49
        jackets=21
        PrintInventory()
    }
}
class Store{
    var shoes = 10
    var shirts =20
    var jackets = 30

    fun PrintInventory(){
        println("The Store has $shoes Shoes, $shirts Shirt and $jackets Jackets.")
    }
}