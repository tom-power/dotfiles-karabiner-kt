package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import se.tp21.dotfiles.karabiner.profiles.shura
import se.tp21.dotfiles.karabiner.utils.encode
import kotlin.test.assertEquals

class DotfilesProfilesTest {
    @Test
    fun `dotfiles are correct for shura`() {
        assertEquals(
            expected = shuraJson.trimAll(),
            actual = shura().encode().trimAll(),
        )
    }

    private val shuraJson = javaClass.getResource("/shura.json")!!.readText()
}