package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.*

fun deviceConfigurationShura() =
    DeviceConfiguration(
        identifiers = deviceIdentifierShura(),
        simpleModifications = simpleModificationsShura(),
    )

private fun deviceIdentifierShura(): DeviceIdentifier = DeviceIdentifier(
    isKeyboard = true,
    vendorId = 6127,
    productId = 24647,
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