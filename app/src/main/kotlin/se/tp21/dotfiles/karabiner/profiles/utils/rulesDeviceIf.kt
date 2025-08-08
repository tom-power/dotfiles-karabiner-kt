package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.Condition
import sh.kau.karabiner.DeviceIdentifier
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Manipulator


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

