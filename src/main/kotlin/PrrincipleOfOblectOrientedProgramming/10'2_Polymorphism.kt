fun main(){
    val messageSayMom = Mother()
    messageSayMom.say("hello HI")
    messageSayMom.say(5)
    messageSayMom.say ("hi",10)
}

class Mother(){
    fun say(messages:String){
        println("mom says $messages")
    }
    fun say(Num:Int){
        for (i in 1..Num){
            println("say it $Num Times")
        }
    }
    fun say(messages: String,times:Int){
        for (i in 1..times){
            println("say $i times $messages")
        }
    }

}