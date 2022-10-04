fun main(){
   var money = arrayListOf(4000,3000,1000,2000)
   val Avg =  average(money)
    println(Avg)
}
fun average(salary: ArrayList<Int>): Double {
    if(salary.size<3){
        val Min = salary.min()
        val Max = salary.max()
        return ((Min.plus(Max))/2).toDouble()
    }else{
        val Min = salary.min()
        val Max = salary.max()
        salary.remove(Min)
        salary.remove(Max)
        return salary[0].toDouble()
    }
}