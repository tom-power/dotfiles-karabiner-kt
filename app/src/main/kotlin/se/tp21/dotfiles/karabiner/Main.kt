package se.tp21.dotfiles.karabiner

import sh.kau.karabiner.json
import java.io.File

fun main() {
    try {
        val karabinerJson = json().encodeToString(karabinerConfig())

        File("build/karabiner.json").let {
            it.writeText(karabinerJson)
            println("Successfully wrote json to ${it.absolutePath}")
        }
    } catch (e: Exception) {
        System.err.println("Error writing json: ${e.message}")
        e.printStackTrace()
    }
}
