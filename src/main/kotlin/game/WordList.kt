package game

import java.io.File
import java.io.InputStream
import java.util.concurrent.ThreadLocalRandom

class WordList {

    var words = mutableListOf<String>()
    var usedWords = mutableListOf<String>()

    //reads a list of words from file
    fun ReadList() {
       var file: InputStream = File("C:\\Users\\attilb\\Desktop\\kotlin projekt\\src\\main\\kotlin\\words\\list.txt").inputStream()
        file.bufferedReader().forEachLine { words.add(it) }
    }

    //choose a random word from the list
    fun ChooseRandomWord(): String {
        if(words.size == 0) {
            words = usedWords
            usedWords = mutableListOf<String>()
        }
        val choice = words.removeAt(ThreadLocalRandom.current().nextInt(0, words.size))
        usedWords.add(choice)
        return choice
    }
}