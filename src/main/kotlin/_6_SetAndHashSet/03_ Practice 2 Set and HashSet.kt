fun main(){
    val objects = hashSetOf<String>("laptop","mouse","phone","bottle","cup")
    val removeObjects = setOf<String>("cup","bottel","phone")
    objects.removeAll(removeObjects)
    println(objects)
}