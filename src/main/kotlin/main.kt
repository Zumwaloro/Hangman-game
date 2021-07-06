import game.WordList

fun main(args: Array<String>) {
//menu()
    var list = WordList()
    list.ReadList()
    println(list.ChooseRandomWord())
    println(list.ChooseRandomWord())
    println(list.ChooseRandomWord())
    println(list.ChooseRandomWord())
    println(list.ChooseRandomWord())
}

fun menu() {

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

}