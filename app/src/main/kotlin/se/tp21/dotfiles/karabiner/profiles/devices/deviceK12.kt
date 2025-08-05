package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.*

fun deviceConfigurationK12() =
    DeviceConfiguration(
        identifiers = deviceIdentifierK12(),
        simpleModifications = simpleModificationsK12(),
    )

fun deviceIdentifierK12() =
    DeviceIdentifier(
        isKeyboard = true,
        vendorId = 1241,
        productId = 591
    )

fun simpleModificationsK12() =
    listOf(
        SimpleModification(
            from =
                SimpleModificationKey(
                    keyCode = ModifierKeyCode.Fn,
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = KeyCode.LeftArrow,
                    )
                )
        ),
        SimpleModification(
            from =
                SimpleModificationKey(
                    keyCode = ModifierKeyCode.RightControl,
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = KeyCode.RightArrow,
                    )
                )
        )
    )