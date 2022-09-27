fun main(){
 val tv = TV()
    tv.getChannel("BCC")
    tv.getChannel("HBO",true)
    tv.getChannel("CNN","10:30")
}
class TV{
    fun getChannel(id:String){
        println("Regular broadCast Channel $id ")
    }
    fun getChannel(id: String,subTitle: Boolean){
        println("Regular broadCast for Channel $id")
        if (subTitle){
            println("with SubTitles")
        }else{
            println("without SubTitles")
        }
    }
    fun getChannel(id: String,Time:String){
        println("The Channel $id BroadCast on Time of $Time")
    }
}