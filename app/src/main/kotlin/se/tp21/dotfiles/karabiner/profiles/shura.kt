package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationShura
import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardIso
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentShura
import sh.kau.karabiner.*
import kotlin.collections.plus

fun shura(): Profile =
    Profile(
        name = "shura",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules = base() + sixtyPercent().rules + sixtyPercentShura().rules
        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationShura()
        ),
        virtualHidKeyboard = keyboardIso()
    )


