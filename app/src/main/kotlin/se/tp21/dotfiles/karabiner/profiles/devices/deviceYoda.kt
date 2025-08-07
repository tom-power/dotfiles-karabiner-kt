package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.*

fun deviceConfigurationYoda() =
    DeviceConfiguration(
        identifiers = deviceIdentifierYoda(),
        simpleModifications = simpleModificationsYoda(),
    )

fun deviceIdentifierYoda() =
    DeviceIdentifier(
        isKeyboard = true,
        vendorId = 1241,
        productId = 355,
    )

fun deviceIfYodaRules(): List<KarabinerRule> =
    sixtyPercentRules().withDeviceIfConditionFor(
        listOf(
            deviceIdentifierYoda()
        )
    )

private fun simpleModificationsYoda() =
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