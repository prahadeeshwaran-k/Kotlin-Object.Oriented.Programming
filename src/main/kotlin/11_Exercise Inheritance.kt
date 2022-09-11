fun main(args: Array<String>) {
    var engineer =Engineer()
    var doctor = Doctor()

    doctor.name = "Doctor"
    engineer.name = "Engineer"

    engineer.salary = 20000
    doctor.salary = 18000

    engineer.work()
    engineer.study()
    engineer.work()

    doctor.study()
    doctor.study()
    doctor.work()
}
open class Job{
    var name = "Name"
    var revenue = 0
    var salary = 10000
    fun work (){
        revenue += salary
        println("$name Revenue $revenue")
    }
    fun study(){
        salary += 9000
        println("$name Revenue $salary")

    }
}
class Engineer:Job(){
}
class Doctor:Job(){
}