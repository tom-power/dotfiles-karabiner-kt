package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.utils.snippetModifications
import sh.kau.karabiner.json
import java.io.File

fun main() {
    try {
        val snippetRules = snippetModifications("src/main/resources/snippetRules.json").rules
        val karabinerJson = json().encodeToString(karabinerConfig(snippetRules))
        val karabinerFile = File("build/karabiner.json")
        with(karabinerFile) {
            writeText(karabinerJson)
            println("Successfully wrote json to $absolutePath")
        }
    } catch (e: Exception) {
        System.err.println("Error writing json: ${e.message}")
        e.printStackTrace()
    }
}
