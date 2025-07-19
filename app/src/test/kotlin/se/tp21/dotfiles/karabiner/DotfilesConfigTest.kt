package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import sh.kau.karabiner.json
import kotlin.test.assertEquals

class DotfilesConfigTest {
    @Test
    fun `karabiner config is correct`() {
        assertEquals(
            expected = karabinerJson.trimAll(),
            actual = json().encodeToString(karabinerConfig()).trimAll(),
        )
    }

    private val karabinerJson = javaClass.getResource("/karabiner.json")!!.readText()
}


