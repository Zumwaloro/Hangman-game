package game

class HighScores {
    var scores = mutableListOf<GameSequence>()

    fun SetSequence(sequence: GameSequence) {
        scores.add(sequence)
        scores.sortByDescending { it.totalPoints }
    }

    fun DisplayHighScores() {
        if (scores.size == 0) {
            println("")
            println("No high-scores yet.")
        } else {
            println("")
            println("High-scores in descending order: ")
            println("")
            scores.forEachIndexed { index, score ->
                println("Place: ${index+1}")
                println("Name: ${score.name}")
                println("Total points: ${score.totalPoints}")
                println("Number of games: ${score.numberOfgames}")
                println("")
            }
        }
    }

}