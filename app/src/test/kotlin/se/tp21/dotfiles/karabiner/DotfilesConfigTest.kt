package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import sh.kau.karabiner.json
import kotlin.test.assertEquals

class DotfilesConfigTest {
    @Test
    fun `karabiner config is correct`() {
        val expected = karabinerJson.trimAll()
        val actual = json().encodeToString(karabinerConfig()).trimAll()
        runCatching {
            assertEquals(expected, actual)
        }.onFailure {
            writeActual("src/test/resources", "karabiner", actual)
            throw it
        }
    }

    private val karabinerJson = javaClass.getResource("/karabiner.json")!!.readText()
}


