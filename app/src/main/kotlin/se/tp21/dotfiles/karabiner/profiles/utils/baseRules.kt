package se.tp21.dotfiles.karabiner.profiles.utils

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasNavigation
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasSymbols
import se.tp21.karabiner.larks.larksTerminal
import se.tp21.karabiner.larks.larksMacToPc
import se.tp21.karabiner.larks.larksNavigation
import se.tp21.karabiner.larks.larksNoQuit
import se.tp21.karabiner.larks.larksWrap
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasEditing
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasTerminal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFn
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.KarabinerRule

fun baseRules(): List<KarabinerRule> =
    (rightShiftViLikes()
        + larks())

private fun rightShiftViLikes(): List<KarabinerRule> =
    (rightShiftViLikeWithTerminalExtras()
        + rightShiftViLikeExtrasEditing().rules
        + rightShiftViLikeExtrasNavigation().rules
        + rightShiftViLikeExtrasSymbols().rules
)

private fun rightShiftViLikeWithTerminalExtras(): List<KarabinerRule> =
    (rightShiftViLikeExtrasTerminal().rules // order is important as has overrides
        + rightShiftViLike().rules)

private fun larks(): List<KarabinerRule> =
    (larksTerminal().rules
        + larksMacToPc().rules.filter { it.description == doubleQuote }
        + larksNavigation().rules
        + larksNoQuit().rules
        + larksWrap().rules)

private const val doubleQuote = "\" (right_shift + 2)"

private fun sixtyPercentRules() =
    sixtyPercentFn().rules +
        sixtyPercentNavigation().rules +
        sixtyPercentSymbols().rules
