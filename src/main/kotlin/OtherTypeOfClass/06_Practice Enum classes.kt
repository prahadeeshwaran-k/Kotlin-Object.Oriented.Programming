fun main(){
var currentState=GameState.Started
    for (i in 1..30){
        println("${currentState.ordinal+1}.$currentState")
        currentState=changeState(currentState)
    }
}
fun changeState(currentState:GameState):GameState{
    when(currentState){
        GameState.Started-> return GameState.Playing
        GameState.Playing-> return GameState.Gameover
        GameState.Gameover-> return GameState.Started
    }
}
enum class GameState{
    Started,
    Playing,
    Gameover
}