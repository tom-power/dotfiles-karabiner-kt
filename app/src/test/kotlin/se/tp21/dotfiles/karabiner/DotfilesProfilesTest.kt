package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import sh.kau.karabiner.Profile
import sh.kau.karabiner.json
import java.io.File
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DotfilesProfilesTest {

    @ParameterizedTest
    @MethodSource("keyToProfile")
    fun `snippets rules are correct`(key: String, profile: Profile) {
        val expected = javaClass.getResource("/profiles/${key}.json")!!.readText().trimAll()
        val actual = json().encodeToString(profile).trimAll()
        runCatching {
            assertEquals(expected, actual)
        }.onFailure {
            val resourceDir = File("src/test/resources/profiles").also { it.mkdirs() }
            File(resourceDir, "${key}.actual.json").writeText(actual)
            throw it
        }
    }

    @Suppress("unused")
    private fun keyToProfile() =
        profiles().toList().map { (key, profile) -> Arguments.of(key, profile) }

}

fun main() {
    val dir = File("src/test/resources/profiles")
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


