package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.DeviceConfiguration
import sh.kau.karabiner.DeviceIdentifier

fun deviceConfigurationMacbookAir() =
    DeviceConfiguration(
        identifiers = deviceIdentifierMacbookAir(),
    )

private fun deviceIdentifierMacbookAir(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 641,
        vendorId = 1452
    )

