fun main(args: Array<String>){
    if(DataBaseAccess.connected){
        DataBaseAccess.disconnect()
    }else{
        DataBaseAccess.connect()
    }
    println("Database is connected: ${DataBaseAccess.connected}")
}
object DataBaseAccess{
    var connected = false
    fun connect(){
        connected = true
        println("Connected to the database")
    }
    fun disconnect(){
        connected = false
        println("Disconnected from the database")
    }
}