package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import sh.kau.karabiner.Profile
import sh.kau.karabiner.json
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
            writeActual("src/test/resources/profiles", key, actual)
            throw it
        }
    }

    @Suppress("unused")
    private fun keyToProfile() =
        profiles(emptyList()).toList().map { (key, profile) -> Arguments.of(key, profile) }

}

