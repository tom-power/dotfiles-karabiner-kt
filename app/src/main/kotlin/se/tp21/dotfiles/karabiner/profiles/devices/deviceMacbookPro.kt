package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.DeviceConfiguration
import sh.kau.karabiner.DeviceIdentifier

fun deviceConfigurationMacbookPro() =
    DeviceConfiguration(
        identifiers = deviceIdentifierMacbookPro()
    )

private fun deviceIdentifierMacbookPro(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 591,
        vendorId = 1452
    )

