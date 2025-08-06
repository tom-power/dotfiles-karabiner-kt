package se.tp21.dotfiles.karabiner.profiles.snippets

import se.tp21.karabiner.snippets.SnippetRules
import se.tp21.karabiner.snippets.complexModificationsFrom
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.json
import java.io.File

fun snippetModifications(path: String): ComplexModifications {
    val snippetRulesJson =
        File(path).inputStream().bufferedReader().use { it.readText() }
    val snippetRules = snippetRulesJson.let { json().decodeFromString<SnippetRules>(it) }
    return complexModificationsFrom(snippetRules)
}
