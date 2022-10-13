fun main (){
    val olympics = Olympics()
    println(olympics.getMedal(2))
    println(olympics.getMedal(7))
    println(olympics.getPosition(Medal.Gold))
    println(olympics.getPosition(Medal.Bronze))

}
enum class Medal(val position:Int){
    Gold(1),
    Silver(2),
    Bronze(3),
    None(4)
}
class Olympics{
    fun getMedal(Position:Int):Medal{
        return when(Position){
            1->Medal.Gold
            2->Medal.Silver
            3->Medal.Bronze
            else ->Medal.None
        }
    }

    fun getPosition(medal: Medal)=medal.position
}