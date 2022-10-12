import kotlin.random.Random

fun main(){
    val articles:ArrayList<Article> = arrayListOf<Article>()
        articles.add(getArticle())
        articles.add(getArticle())
    val newAritcles  = arrayListOf<Article>()
    for (article in  articles){
        newAritcles.add(article)
        val newArticle:Article = article.copy(title = article.title + "for my blog")
        newAritcles.add(newArticle)
    }
    newAritcles.forEach { println(it) }
}
fun getArticle():Article{
    var randomTitle:String ="Title"+ Random.nextInt(100)
    val numberOfReaders:Int = Random.nextInt(1000)
    return Article(randomTitle,"SomeText",numberOfReaders)
}
data class Article(
    val title:String,
    val content:String,
    val noReaders:Int
)