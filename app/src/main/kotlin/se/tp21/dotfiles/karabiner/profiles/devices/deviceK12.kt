package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentK12
import sh.kau.karabiner.*

fun deviceConfigurationK12(): DeviceConfiguration = DeviceConfiguration(
    identifiers = deviceIdentifierK12(),
    simpleModifications = simpleModificationsK12(),
)

fun deviceIfRulesK12(): List<KarabinerRule> =
    sixtyPercentK12().rules.withDeviceIfConditionFor(listOf(deviceIdentifierK12()))

fun deviceIdentifierK12(): DeviceIdentifier = deviceIdentifierBlueTooth()


private fun simpleModificationsK12() =
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