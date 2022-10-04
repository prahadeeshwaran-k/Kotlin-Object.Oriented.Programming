fun main(args: Array<String>){
    val num:ArrayList<Int> = arrayListOf(1,3,8,5,423,52,452,88,43,97,55)
    println(num)
    val newNumbers:ArrayList<Int> = update(num){number->number/10}
    println(newNumbers)
}
fun update(num: ArrayList<Int>,lbd:(Int)->Int ):ArrayList<Int>{
    for (i:Int in 0 until num.size){
        if (num[i]%2==0){
            num[i] = lbd(num[i])
        }
    }
    return num
}



