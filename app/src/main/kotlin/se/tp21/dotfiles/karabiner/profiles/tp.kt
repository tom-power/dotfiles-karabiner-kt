package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardIso
import se.tp21.dotfiles.karabiner.profiles.utils.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import sh.kau.karabiner.*

fun tp(): Profile =
    Profile(
        name = "tp",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules = base() + sixtyPercent().rules
        ),
        devices = listOf(
            deviceConfigurationMacbook()
        ),
        virtualHidKeyboard = keyboardIso()
    )