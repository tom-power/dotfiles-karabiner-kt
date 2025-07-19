package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import se.tp21.dotfiles.karabiner.profiles.utils.deviceConfigurationMacbook
import se.tp21.dotfiles.karabiner.profiles.utils.keyboardIso
import se.tp21.dotfiles.karabiner.profiles.utils.simpleModificationsGlobal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentShura
import sh.kau.karabiner.*
import kotlin.collections.plus

fun shura(): Profile =
    Profile(
        name = "shura",
        complexModifications = ComplexModifications(
            rules = base() + sixtyPercentShura().rules
        ),
        devices = listOf(
            deviceConfigurationMacbook(),
            deviceConfigurationShura()
        ),
        virtualHidKeyboard = keyboardIso()
    )

private fun deviceConfigurationShura(): DeviceConfiguration = DeviceConfiguration(
    identifiers = deviceIdentifierShinobi(),
    simpleModifications = simpleModificationsGlobal() + simpleModificationsShura(),
)

private fun deviceIdentifierShinobi(): DeviceIdentifier = DeviceIdentifier(
    isKeyboard = true,
    productId = 24647,
    vendorId = 6127
)

private fun simpleModificationsShura() =
    listOf(
        SimpleModification(
            from =
                SimpleModificationKey(
                    keyCode = ModifierKeyCode.LeftOption,
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = ModifierKeyCode.LeftCommand,
                    )
                )
        ),
        SimpleModification(
            from =
                SimpleModificationKey(
                    keyCode = ModifierKeyCode.LeftCommand,
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = ModifierKeyCode.LeftOption,
                    )
                )
        )
    )


