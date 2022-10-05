fun main(){
    val client :ArrayList<String>  = arrayListOf("michael","jane","Tommy","Dan")
    val message :ArrayList<String> = getMessages(client){name-> "Hello $name are you ok" }
    println(client)
    println(message)
    for(i in 0 until client.size){
        println("message for ${client[i]}")
            println(message[i])
                println()
    }
}
fun getMessages(clients:Collection<String>,getMessages: (String)->String):ArrayList<String>{
    val message:ArrayList<String> = arrayListOf<String>()
    for (client:String in clients){
        message.add(getMessages(client))
    }
    return message
}