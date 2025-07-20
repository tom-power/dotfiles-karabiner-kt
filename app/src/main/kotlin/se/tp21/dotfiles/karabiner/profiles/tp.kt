package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationK12
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationShinobi
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationShura
import se.tp21.dotfiles.karabiner.profiles.devices.deviceConfigurationYoda
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesK12
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesShura
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesYoda
import se.tp21.dotfiles.karabiner.profiles.utils.baseRules
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Profile

fun tp(snippetRules: List<KarabinerRule>): Profile =
    Profile(
        name = "tp",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules =
                baseRules()
                    + snippetRules
                    + deviceIfRulesShura()
                    + deviceIfRulesK12()
                    + deviceIfRulesYoda()

        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationShura(),
            deviceConfigurationK12(),
            deviceConfigurationYoda(),
            deviceConfigurationShinobi()
        ),
        virtualHidKeyboard = keyboardAnsi(),
        selected = true
    )