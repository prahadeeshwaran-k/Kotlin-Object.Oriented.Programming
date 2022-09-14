fun main(array: Array<String>) {
    val myBook = ShowEditor(ShowEditor.getEditor())
    println(myBook.editor.editorName)
}
class ShowEditor(val editor:Editor){
    companion object{
        fun getEditor()= Editor("Brain Storm")
    }
}
class Editor(val editorName:String){

}