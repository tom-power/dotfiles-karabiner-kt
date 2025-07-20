package se.tp21.dotfiles.karabiner

import java.io.File

fun String.trimAll() = trimStart().trimEnd().trimIndent()

fun writeActual(dir: String, fileName: String, text: String) {
    val resourceDir = File(dir).also { it.mkdirs() }
    File(resourceDir, "${fileName}.actual.json").writeText(text)
}

fun approveAllIn(dir: File) {
    dir.walkTopDown()
        .filter {
            it.isFile && it.name.endsWith(".actual.json")
        }
        .forEach { file ->
            val target = File(file.parentFile, file.name.replace(".actual.json", ".json"))
            file.copyTo(target, overwrite = true)
            file.delete()
            println("Renamed ${file.name} to ${target.name}")
        }
}
