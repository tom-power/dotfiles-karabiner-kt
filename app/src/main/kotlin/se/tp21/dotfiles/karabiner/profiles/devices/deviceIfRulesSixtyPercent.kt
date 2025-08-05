package se.tp21.dotfiles.karabiner.profiles.devices

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFn
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.KarabinerRule

fun deviceIfRulesSixtyPercent(): List<KarabinerRule> =
    sixtyPercentRules().withDeviceIfConditionFor(
        listOf(
            deviceIdentifierK12(),
            deviceIdentifierYoda()
        )
    )

private fun sixtyPercentRules() =
    sixtyPercentFn().rules +
        sixtyPercentNavigation().rules +
        sixtyPercentSymbols().rules
