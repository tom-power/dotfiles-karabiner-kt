package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.Condition
import sh.kau.karabiner.DeviceIdentifier
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.Manipulator

fun List<KarabinerRule>.withDeviceIfConditionFor(identifier: DeviceIdentifier): List<KarabinerRule> {
    val deviceIfCondition = Condition.DeviceIfCondition(listOf(identifier))
    return this.map { rule ->
        rule.copy(
            manipulators =
                rule.manipulators
                    ?.map { manipulator ->
                        manipulator.withDeviceIfCondition(deviceIfCondition)
                    }
        )
    }
}

private fun Manipulator.withDeviceIfCondition(deviceIfCondition: Condition.DeviceIfCondition): Manipulator =
    this.copy(
        conditions =
            this.conditions
                ?.plus(listOf<Condition>(deviceIfCondition))
                ?: listOf<Condition>(deviceIfCondition)
    )