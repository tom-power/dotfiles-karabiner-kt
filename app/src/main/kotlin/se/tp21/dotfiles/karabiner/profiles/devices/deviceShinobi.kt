package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import sh.kau.karabiner.DeviceConfiguration
import sh.kau.karabiner.DeviceIdentifier

fun deviceConfigurationShinobi() =
    DeviceConfiguration(
        identifiers = deviceIdentifierShinobi(),
        simpleModifications = simpleModificationsGlobal()
    )

private fun deviceIdentifierShinobi(): DeviceIdentifier = deviceIdentifierBlueTooth()