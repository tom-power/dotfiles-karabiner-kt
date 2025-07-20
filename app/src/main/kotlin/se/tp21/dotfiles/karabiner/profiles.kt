package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.tp
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Profile

fun profiles(snippetRules: List<KarabinerRule>): Map<String, Profile> =
    mapOf(
        "tp" to tp(snippetRules),
    )
