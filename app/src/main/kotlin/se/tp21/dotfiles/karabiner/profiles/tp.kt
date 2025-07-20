package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationK12
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationShura
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesK12
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesShura
import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.Profile

fun tp(): Profile =
    Profile(
        name = "tp",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules =
                base()
                    + deviceIfRulesShura()
                    + deviceIfRulesK12()

        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationShura(),
            deviceConfigurationK12()
        ),
        virtualHidKeyboard = keyboardAnsi(),
        selected = true
    )