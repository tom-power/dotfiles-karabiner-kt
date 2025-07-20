package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.k12
import se.tp21.dotfiles.karabiner.profiles.macbook
import se.tp21.dotfiles.karabiner.profiles.shinobi
import se.tp21.dotfiles.karabiner.profiles.shura
import se.tp21.dotfiles.karabiner.profiles.tp
import se.tp21.dotfiles.karabiner.profiles.yoda
import sh.kau.karabiner.Profile

fun profiles(): Map<String, Profile> =
    mapOf(
        "tp" to tp(),
        "k12" to k12(),
        "macbook" to macbook(),
        "shinobi" to shinobi(),
        "shura" to shura(),
        "yoda" to yoda(),
    )
