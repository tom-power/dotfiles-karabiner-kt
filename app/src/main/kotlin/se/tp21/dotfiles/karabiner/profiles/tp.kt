package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.devices.*
import se.tp21.dotfiles.karabiner.profiles.utils.baseRules
import se.tp21.dotfiles.karabiner.profiles.devices.deviceIfRulesSixtyPercent
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Profile

fun tp(snippetRules: List<KarabinerRule>): Profile =
    Profile(
        name = "tp",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications =
            ComplexModifications(
                rules =
                    baseRules()
                        + deviceIfRulesSixtyPercent()
                        + snippetRules
            ),
        devices =
            listOf(
                deviceConfigurationMacbookPro(),
                deviceConfigurationMacbookAir(),
                deviceConfigurationShura(),
                deviceConfigurationK12(),
                deviceConfigurationYoda(),
            ),
        virtualHidKeyboard = keyboardAnsi(),
        selected = true
    )