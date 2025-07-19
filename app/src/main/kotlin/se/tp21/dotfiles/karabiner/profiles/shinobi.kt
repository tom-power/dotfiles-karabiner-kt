package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardAnsi
import se.tp21.dotfiles.karabiner.profiles.utils.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.*

fun shinobi(): Profile =
    Profile(
        name = "shinobi",
        complexModifications = ComplexModifications(
            rules = base()
        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationShinobi()
        ),
        virtualHidKeyboard = keyboardAnsi()
    )

private fun deviceConfigurationShinobi(): DeviceConfiguration =
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
