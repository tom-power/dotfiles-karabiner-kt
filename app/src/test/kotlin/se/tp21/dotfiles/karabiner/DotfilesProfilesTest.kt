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
        assertEquals(
            expected = javaClass.getResource("/profiles/${key}.json")!!.readText().trimAll(),
            actual = json().encodeToString(profile).trimAll(),
        )
    }

    @Suppress("unused")
    private fun keyToProfile() =
        profiles().toList().map { (key, profile) -> Arguments.of(key, profile) }

}


