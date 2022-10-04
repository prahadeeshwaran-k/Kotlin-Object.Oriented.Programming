//Given two non-negative integers low and high. Return the count of odd numbers between low and high

fun main(){
   val low: String? = readLine()
    val low1 = low?.toInt()
   val high : String? = readLine()
    val high1 = high?.toInt()

    val odd = countOdds(low1,high1)
   println(odd)

}
fun countOdds(low: Int?, high: Int?): Int {
    var result = 0
    if (high != null) {
        if (low != null) {
            for (i in low..(high + 1)){
                if(i%2==0)result+=1
            }
        }
    }
    return result
}