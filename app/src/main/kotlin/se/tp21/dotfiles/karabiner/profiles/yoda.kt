package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentYoda
import sh.kau.karabiner.*
import kotlin.collections.plus

fun yoda(): Profile =
    Profile(
        name = "yoda",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules = base() + sixtyPercent().rules + sixtyPercentYoda().rules
        ),
        devices = listOf(deviceConfigurationMacbook()),
        virtualHidKeyboard = keyboardAnsi()
    )
