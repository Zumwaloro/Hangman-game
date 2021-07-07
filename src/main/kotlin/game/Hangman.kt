package game

import java.util.*

class Hangman {
    var highScores = HighScores()
    val input = Scanner(System.`in`)

    fun play() {
        println("")
        println("")
        println("")
        println("")
        println("      ,%%%%%%%%,            ___________________________________")
        println("     %%o%%/%%%%%%")
        println("    %%%%¨\\%%%<%%%%%           H -- A -- N -- G -- M -- A -- N ")
        println("    %%>%%%/%%%%o%%          ___________________________________ ")
        println("    %%%%%o%%\\%%//%")
        println("    %\\o%\\%%/%o/%%'        'What did you bring me, my dear friends,")
        println("     '%%\\ `%/%%%'            To keep me from the Gallows Pole?'")
        println("       '%| |%|%'                     - Led Zeppelin -")
        println("         | | (O")
        println("         | | |\\                       ___ MENU:___")
        println("         | | >>                       1 Play")
        println("         | |                          2 HighScore")
        println("        /   \\                         0 Quit")
        println(" ^^^^^^^^^^^^^^^^^^^^")
        println("")
        println("")
        println("")
        println("")

        println("Menu choice: ")
        var choice = input.nextLine()
        when(choice) {
            "1" -> {
                println("")
                println("What is your name? ")
                var name = input.nextLine()
                var game = GameSequence(name)
                game.start()
                highScores.SetSequence(game)
                println("")
                play()
            }
            "2" -> {
                println("")
                highScores.DisplayHighScores()
                println("")
                play()
            }
            else -> {
                println("")
                println("Goodbye!")
            }
        }

    }
}