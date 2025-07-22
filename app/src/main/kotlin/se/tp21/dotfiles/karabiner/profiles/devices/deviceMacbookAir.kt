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
        vendorId = 1452,
        productId = 641,
    )

