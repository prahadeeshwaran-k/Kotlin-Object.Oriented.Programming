fun main(){
    val restaurant1:Restaurant = LocalRestaurant()
    restaurant1.provideFood()
    restaurant1.provideBill()
    val restaurant2:Restaurant = FancyRestaurant()
    restaurant2.provideFood()
    restaurant2.provideBill()
}
interface Restaurant{
    fun provideFood()
    fun provideBill()
}
class LocalRestaurant: Restaurant{
    override fun provideFood() {
    println("Your Local Restaurant provide food and drink")
    }

    override fun provideBill() {
    println("please pay 25")
        }
}
class FancyRestaurant:Restaurant{
    override fun provideFood() {
        println("Most delicious food")
    }

    override fun provideBill() {
    println("please pay 100")
    }

}