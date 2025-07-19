package se.tp21.dotfiles.karabiner.profiles

import sh.kau.karabiner.Profile

fun profiles(): Map<String, Profile> =
    mapOf(
        "shura" to shura()
    )
