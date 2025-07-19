package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import se.tp21.dotfiles.karabiner.utils.encode
import kotlin.test.assertEquals

class DotfilesConfigTest {
    @Test
    fun `karabiner config is correct`() {
        assertEquals(
            expected = karabinerJson.trimAll(),
            actual = karabinerConfig().encode().trimAll(),
        )
    }

    private val karabinerJson = javaClass.getResource("/karabiner.json")!!.readText()
}


