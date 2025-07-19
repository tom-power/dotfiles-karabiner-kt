package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardIso
import se.tp21.dotfiles.karabiner.profiles.utils.deviceConfigurationMacbook
import sh.kau.karabiner.*

fun macbook(): Profile =
    Profile(
        name = "macbook",
        complexModifications = ComplexModifications(
            rules = base()
        ),
        devices = listOf(
            deviceConfigurationMacbook()
        ),
        virtualHidKeyboard = keyboardIso()
    )