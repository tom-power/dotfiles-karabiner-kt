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
        vendorId = 1452,
        productId = 835,
    )

