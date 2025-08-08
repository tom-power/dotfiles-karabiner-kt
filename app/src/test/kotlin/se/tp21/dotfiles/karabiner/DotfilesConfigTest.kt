package se.tp21.dotfiles.karabiner

import org.junit.jupiter.api.Test
import se.tp21.dotfiles.karabiner.profiles.utils.snippetModifications
import se.tp21.resourcesapproval.ResourcesApproval
import se.tp21.resourcesapproval.WriteTo
import sh.kau.karabiner.json

class DotfilesConfigTest {
    @Test
    fun `karabiner config is correct`() {
        ResourcesApproval.assertApproved(
            actual = karabinerConfig(snippetModifications(testSnippetRulesPath).rules).let { json().encodeToString(it) },
            approved = "karabiner.json",
            writeTo = WriteTo.Approved
        )
    }

    private val testSnippetRulesPath = "src/test/resources/snippetRules/test.json"
}