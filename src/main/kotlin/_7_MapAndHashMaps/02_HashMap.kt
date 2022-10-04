fun main(){
    var name = hashMapOf<String,Int>(Pair("Bala",89), Pair("Tommy",92), Pair("KVSS",91))
    name.put("NG",78)
    name["GK"] = 70
    println(name)

    var MoreName = hashMapOf(Pair("kumar",89), Pair("danger",56))
    name.putAll(MoreName)
    println(name)
    println(name.remove("Bala"))
    name.replace("GK",89)
    println(name)
}