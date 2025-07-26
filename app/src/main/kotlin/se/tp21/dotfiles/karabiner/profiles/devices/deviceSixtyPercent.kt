package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import sh.kau.karabiner.KarabinerRule

fun deviceIfRulesSixtyPercent(): List<KarabinerRule> =
    sixtyPercent().rules.withDeviceIfConditionFor(
        listOf(
            deviceIdentifierK12(),
            deviceIdentifierYoda()
        )
    )