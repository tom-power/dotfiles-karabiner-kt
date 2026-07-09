package se.tp21.dotfiles.karabiner.profiles.utils

import se.tp21.larks.karabiner.modifications.*
import se.tp21.rightshiftvilike.karabiner.modifications.*
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFunctionKeys
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.KarabinerRule

fun baseRules(): List<KarabinerRule> =
    rightShiftViLikes() +
        larks()

private fun rightShiftViLikes(): List<KarabinerRule> =
    rightShiftViLikeWithTerminalExtras() +
        rightShiftViLikeExtrasEditing().rules +
        rightShiftViLikeExtrasNavigation().rules +
        rightShiftViLikeExtrasSymbols().rules

private fun rightShiftViLikeWithTerminalExtras(): List<KarabinerRule> =
    rightShiftViLikeExtrasTerminal().rules +
        rightShiftViLike().rules

private fun larks(): List<KarabinerRule> =
    larksClicking().rules +
        larksCommand().rules +
        larksCommandControlTerminal().rules +
        larksGaming().rules +
        larksMacSystemKeys().rules +
        larksNavigation().rules +
        larksWrap().rules

fun sixtyPercentRules() =
    sixtyPercentFunctionKeys().rules +
        sixtyPercentNavigation().rules +
        sixtyPercentSymbols().rules