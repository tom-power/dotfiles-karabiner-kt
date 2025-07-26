package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentShura
import sh.kau.karabiner.*

fun deviceConfigurationShura(): DeviceConfiguration = DeviceConfiguration(
    identifiers = deviceIdentifierShura(),
    simpleModifications = simpleModificationsShura(),
)

fun deviceIfRulesShura(): List<KarabinerRule> =
    sixtyPercentShura().rules.withDeviceIfConditionFor(listOf(deviceIdentifierShura()))

private fun deviceIdentifierShura(): DeviceIdentifier = deviceIdentifierThinkPadDock()

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