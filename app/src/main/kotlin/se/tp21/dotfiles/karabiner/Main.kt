package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.utils.encode
import java.io.File

fun main() {
    try {
        val karabinerJson = karabinerConfig().encode()

        File("build/karabiner.json").let {
            it.writeText(karabinerJson)
            println("Successfully wrote json to ${it.absolutePath}")
        }
    } catch (e: Exception) {
        System.err.println("Error writing json: ${e.message}")
        e.printStackTrace()
    }
}
