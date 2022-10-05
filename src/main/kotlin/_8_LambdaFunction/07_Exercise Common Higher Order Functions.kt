fun main(){
    val num = listOf(12,54,34,97,56,38,45,57,8)
    val subSet  = num.map{
        if (it%2==0)
            {it/2}
        else
            {it*2}
        }
        .filter {it>25 }
    println(subSet)
}
