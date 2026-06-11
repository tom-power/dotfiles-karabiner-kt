package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.devices.*
import se.tp21.dotfiles.karabiner.profiles.utils.*
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
                        + sixtyPercentRules()
                            .withDeviceIfConditionFor(
                                listOf(
                                    deviceIdentifierK12(),
                                    deviceIdentifierYoda(),
                                )
                            )
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