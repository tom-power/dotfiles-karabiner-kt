package se.tp21.dotfiles.karabiner.profiles.utils

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasNavigation
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasSymbols
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasTerminal
import se.tp21.karabiner.larks.larksCommandControl
import se.tp21.karabiner.larks.larksMacToPc
import se.tp21.karabiner.larks.larksNavigation
import se.tp21.karabiner.larks.larksNoQuit
import se.tp21.karabiner.larks.larksWrap
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasEditing
import sh.kau.karabiner.KarabinerRule

fun base(): List<KarabinerRule> =
    (rightShiftViLikes()
        + larks())

private fun rightShiftViLikes(): List<KarabinerRule> =
    (rightShiftViLike().rules
        + rightShiftViLikeExtrasEditing().rules
        + rightShiftViLikeExtrasNavigation().rules
        + rightShiftViLikeExtrasSymbols().rules
        + rightShiftViLikeExtrasTerminal().rules)

private fun larks(): List<KarabinerRule> =
    (larksCommandControl().rules
        + larksMacToPc().rules
        + larksNavigation().rules
        + larksNoQuit().rules
        + larksWrap().rules)

