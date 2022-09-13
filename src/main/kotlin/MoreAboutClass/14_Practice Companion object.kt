fun main(array: Array<String>) {
    var Course = KotlinCourse()
    Course.getCourse()
    KotlinCourse.getCourseMetaInfo()
}
class KotlinCourse{
    fun getCourse(){
        println("Kotlin is java Based Development Language")
    }
    companion object{
        fun getCourseMetaInfo(){
            println("Kotlin is a simple and powerfull language")
        }
    }
}