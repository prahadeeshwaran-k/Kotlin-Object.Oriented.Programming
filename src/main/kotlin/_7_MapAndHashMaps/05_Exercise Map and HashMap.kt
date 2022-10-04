fun main(){
    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept",2588)
    println(attendance)
    val Sept25 = attendance.get("25 Sept")?:0
    val Sept26 = attendance.get("26 Sept")?:0
    val total = Sept25 + Sept26

    println("the total  visitor on 25 and 26 in ${total}")
    println("Is Data Available on 22 Sept ? : ${attendance.containsKey("22 Sept")}")
}