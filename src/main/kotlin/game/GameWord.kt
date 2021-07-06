package game

import java.util.*

class GameWord {
    var usedChars = mutableListOf<Char>()
    var underScores = mutableListOf<Char>()
    var word = mutableListOf<Char>()
    var remainingTries = 10
    var points = 0
    val input = Scanner(System.`in`)

    fun Game(gameWord: String): Int {
        gameWord.forEach { it
            word.add(it)
            underScores.add('_')
        }

        while(remainingTries > 0) {
            if('_' !in underScores) {
                println("Congratulations! You won! The word was $gameWord .")
                points = underScores.size
                println("You receive $points points.")
                println("")
                usedChars = mutableListOf<Char>()
                underScores = mutableListOf<Char>()
                word = mutableListOf<Char>()
                remainingTries = 10
                return points
            }
            println("Your word looks like this so far: $underScores")
            println("Which letter do you choose? ")
            var choice = input.nextLine().toLowerCase().single()
            if(choice in usedChars) {
                println("You have already used this letter. Please choose another!")
            } else if(choice !in word) {
                remainingTries -= 1
                usedChars.add(choice)
                HangmanArt(remainingTries)
                println("Wrong choice! You have $remainingTries tries left.")
            } else {
                word.forEachIndexed() { index, ch ->
                    if(choice == ch) {
                        underScores[index] = choice
                        usedChars.add(ch)
                    }
                }
            }
        }

        println("Game over! You scored $points points.")
        usedChars = mutableListOf<Char>()
        underScores = mutableListOf<Char>()
        word = mutableListOf<Char>()
        remainingTries = 10
        points = 0
        return 0
    }

    fun HangmanArt(points: Int) {
        when(points) {
            9 -> {
                println("")
                println("___|________ ")
            }
            8 -> {
                println("")
                println("   | ")
                println("___|________ ")
                println("")
            }
            7 -> {
                println("")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            6 -> {
                println("")
                println("   | ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            5 -> {
                println("")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            4 -> {
                println("")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            3 -> {
                println("")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            2 -> {
                println("")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            1 -> {
                println("")
                println("   _____________ ")
                println("   |/           ")
                println("   |           ")
                println("   |           ")
                println("   |           ")
                println("   |           ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
            else -> {
                println("")
                println("   _____________ ")
                println("   |/          | ")
                println("   |           | ")
                println("   |           (O ")
                println("   |           |\\  ")
                println("   |           >> ")
                println("   | ")
                println("   | ")
                println("___|________ ")
                println("")
            }
        }
    }

}