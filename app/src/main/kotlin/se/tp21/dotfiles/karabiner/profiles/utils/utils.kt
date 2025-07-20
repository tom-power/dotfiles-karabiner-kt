package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.Condition
import sh.kau.karabiner.DeviceIdentifier
import sh.kau.karabiner.KarabinerRule

fun List<KarabinerRule>.withDeviceIfCondition(identifier: DeviceIdentifier): List<KarabinerRule> =
    this.map {
        val deviceIfCondition = Condition.DeviceIfCondition(listOf(identifier))
        it.copy(
            manipulators =
                it.manipulators?.map { m ->
                    m.copy(conditions = m.conditions?.plus(listOf<Condition>(deviceIfCondition)))
                })
    }