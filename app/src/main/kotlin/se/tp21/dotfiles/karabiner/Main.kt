package se.tp21.dotfiles.karabiner

import se.tp21.karabiner.snippets.SnippetRules
import se.tp21.karabiner.snippets.complexModificationsFrom
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.json
import java.io.File

fun main() {
    try {
        val karabinerJson = json().encodeToString(karabinerConfig(snippetModifications().rules))
        File("build/karabiner.json").let {
            it.writeText(karabinerJson)
            println("Successfully wrote json to ${it.absolutePath}")
        }
    } catch (e: Exception) {
        System.err.println("Error writing json: ${e.message}")
        e.printStackTrace()
    }
}

private fun snippetModifications(): ComplexModifications {
    val snippetRulesJson =
        File("src/main/resources/snippetRules.json").inputStream().bufferedReader().use { it.readText() }
    val snippetRules = json().decodeFromString<SnippetRules>(snippetRulesJson)
    return complexModificationsFrom(snippetRules)
}
