package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.DeviceConfiguration
import sh.kau.karabiner.DeviceIdentifier

fun deviceConfigurationMacbook() =
    DeviceConfiguration(
        identifiers = deviceIdentifierMacbook(),
        ignore = true,
        simpleModifications = simpleModificationsGlobal()
    )

private fun deviceIdentifierMacbook(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 591,
        vendorId = 1452
    )

