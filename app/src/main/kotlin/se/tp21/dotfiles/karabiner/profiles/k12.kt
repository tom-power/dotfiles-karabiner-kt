package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentK12
import sh.kau.karabiner.*

fun k12(): Profile =
    Profile(
        name = "k12",
        simpleModifications = simpleModificationsGlobal(),
        complexModifications = ComplexModifications(
            rules = base() + sixtyPercent().rules + sixtyPercentK12().rules
        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationK12()
        ),
        virtualHidKeyboard = keyboardAnsi()
    )

private fun deviceConfigurationK12(): DeviceConfiguration =
    DeviceConfiguration(
        identifiers = deviceIdentifierK12(),
        simpleModifications = simpleModificationsGlobal()
    )

private fun deviceIdentifierK12(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 835,
        vendorId = 1452
    )