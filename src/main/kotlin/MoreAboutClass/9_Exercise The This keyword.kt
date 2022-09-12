fun main(array: Array<String>) {
    val myTable = NewTable()
    my

}

class NewTable{
    var height = 120
    var size = 200

    fun updateDimension(height:Int,size:Int){
        this.height = height
        this.size = size
    }
    fun printInfo(){
        println{"Table Height is $height and size is  $size "}
    }
}