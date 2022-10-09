fun main(){
    val client = arrayListOf<String?>()
    do {
        println("Enter Client Name: ")
        val input= readLine()
        input?.let {
            if (it.toLowerCase() != "stop"){
                if (it == "")
                    client.add(null)
                else
                    client.add(it)
                }
        }
    }while (input?.toLowerCase() != "stop")
    println(client)
        client.forEach{  it?.let {
            println("Hello $it")
            }

    }

}