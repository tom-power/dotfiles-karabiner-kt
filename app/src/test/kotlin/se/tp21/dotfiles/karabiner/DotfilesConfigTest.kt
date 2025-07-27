package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import se.tp21.resourcesapproval.ResourcesApproval
import sh.kau.karabiner.json

class DotfilesConfigTest {
    @Test
    fun `karabiner config is correct`() {
        ResourcesApproval.assertApproved(
            actual = json().encodeToString(karabinerConfig(emptyList())).trimStart().trimEnd().trimIndent(),
            approved = "karabiner.json"
        )
    }
}