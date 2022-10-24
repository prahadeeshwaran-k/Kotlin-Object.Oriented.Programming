fun main(){
    val geo1 = Geometry<Square>()
    geo1.getMessage(Square(),5)
    val geo2 = Geometry<Circle>()
    geo2.getMessage(Circle(),8)
}
abstract class Shapes{
    abstract fun area(size:Int):Double
}
class Square:Shapes(){
    override fun area(size: Int) = size*size.toDouble()
}
class Circle:Shapes(){
    override fun area(size: Int): Double  = size*size*3.14
    }

class Geometry<T:Shapes>{
    fun getMessage(shape:T,size: Int){
        println("The area of this shape is ${shape.area(size)}")
    }
}