package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.snippets.snippetModifications
import sh.kau.karabiner.json
import java.io.File

fun main() {
    try {
        val snippetRules = snippetModifications("src/main/resources/snippetRules.json").rules
        val karabinerJson = karabinerConfig(snippetRules).let { json().encodeToString(it) }
        File("build/karabiner.json").let {
            it.writeText(karabinerJson)
            println("Successfully wrote json to ${it.absolutePath}")
        }
    } catch (e: Exception) {
        System.err.println("Error writing json: ${e.message}")
        e.printStackTrace()
    }
}
