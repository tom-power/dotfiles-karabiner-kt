package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentYoda
import sh.kau.karabiner.*

fun deviceConfigurationYoda(): DeviceConfiguration = DeviceConfiguration(
    identifiers = deviceIdentifierYoda(),
    simpleModifications = simpleModificationsYoda(),
)

fun deviceIfRulesYoda(): List<KarabinerRule> =
    sixtyPercentYoda().rules.withDeviceIfConditionFor(deviceIdentifierYoda())

private fun deviceIdentifierYoda(): DeviceIdentifier =
    DeviceIdentifier(
        isKeyboard = true,
        productId = 355,
        vendorId = 1241
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