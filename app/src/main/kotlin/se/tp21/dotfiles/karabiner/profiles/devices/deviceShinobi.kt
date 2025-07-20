package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.DeviceConfiguration
import sh.kau.karabiner.DeviceIdentifier

fun deviceConfigurationShinobi(): DeviceConfiguration =
    DeviceConfiguration(
        identifiers = deviceIdentifierShinobi(),
        simpleModifications = simpleModificationsGlobal()
    )

private fun deviceIdentifierShinobi(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 355,
        vendorId = 1241
    )
