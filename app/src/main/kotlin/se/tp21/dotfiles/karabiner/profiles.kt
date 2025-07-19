package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.k12
import se.tp21.dotfiles.karabiner.profiles.shinobi
import se.tp21.dotfiles.karabiner.profiles.shura
import se.tp21.dotfiles.karabiner.profiles.yoda
import sh.kau.karabiner.Profile

fun profiles(): Map<String, Profile> =
    mapOf(
        "shura" to shura(),
        "k12" to k12(),
        "shinobi" to shinobi(),
        "yoda" to yoda(),
    )
