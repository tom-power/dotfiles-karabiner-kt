package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFn
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.Condition
import sh.kau.karabiner.DeviceIdentifier
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Manipulator

internal fun sixtyPercentRules() =
    sixtyPercentFn().rules +
        sixtyPercentNavigation().rules +
        sixtyPercentSymbols().rules

internal fun List<KarabinerRule>.withDeviceIfConditionFor(identifiers: List<DeviceIdentifier>): List<KarabinerRule> {
    val deviceIfCondition = Condition.DeviceIfCondition(identifiers)
    return this.map { rule ->
        rule.copy(
            manipulators =
                rule.manipulators?.map { manipulator ->
                    manipulator.withDeviceIfCondition(deviceIfCondition)
                }
        )
    }
}

private fun Manipulator.withDeviceIfCondition(deviceIfCondition: Condition.DeviceIfCondition): Manipulator =
    this.copy(
        conditions = listOf<Condition>(deviceIfCondition).plus(this.conditions.orEmpty())
    )

