package se.tp21.dotfiles.karabiner.profiles

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.Profile
import sh.kau.karabiner.VirtualHidKeyboard

fun shura(): Profile =
    Profile(
        name = "shura",
        complexModifications = ComplexModifications(rules = listOf()),
        devices = listOf(),
        virtualHidKeyboard = VirtualHidKeyboard()

    )
