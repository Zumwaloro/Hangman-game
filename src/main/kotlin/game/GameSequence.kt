package game

import java.util.*

class GameSequence(var name: String) {
    var wordList = WordList()
    var totalPoints = 0
    var numberOfgames = 0
    private val input = Scanner(System.`in`)

    init {
        wordList.ReadList()
    }

    fun start(): Int {
        println("")
        println("Are you ready to play? Y/N: ")
        var choice = input.nextLine().toLowerCase()
        while (choice == "y") {
            var newGame = GameWord()
            var result = newGame.Game(wordList.ChooseRandomWord())
            if (result == 0) {
                println("")
                print("Thanks for the game! Your total number of points is: $totalPoints")
                return totalPoints
            }
            totalPoints += result
            numberOfgames += 1
            println("Total number of points: $totalPoints , number of games played: $numberOfgames")
            println("")
            println("Would you like to play more? Y/N: ")
            choice = input.nextLine().toLowerCase()
        }
        return totalPoints
    }
}