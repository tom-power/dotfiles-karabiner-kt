package se.tp21.dotfiles.karabiner.profiles

import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLike
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasNavigation
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasSymbols
import se.tp21.rightshiftvilike.karabiner.modifications.rightShiftViLikeExtrasTerminal
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentK12
import sh.kau.karabiner.*

fun k12(): Profile =
    Profile(
        name = "k12",
        complexModifications = ComplexModifications(
            rules =
                rightShiftViLike().rules
                    + rightShiftViLikeExtrasNavigation().rules
                    + rightShiftViLikeExtrasSymbols().rules
                    + rightShiftViLikeExtrasTerminal().rules
                    + sixtyPercentK12().rules
        ),
        devices = listOf(
            DeviceConfiguration(
                identifiers = DeviceIdentifier(
                    isKeyboard = true,
                    productId = 835,
                    vendorId = 1452
                ),
                ignore = true
            ),
            DeviceConfiguration(
                identifiers = DeviceIdentifier(
                    isKeyboard = true,
                    productId = 24647,
                    vendorId = 6127
                ),
                simpleModifications = listOf(
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
            ),
        ),
        virtualHidKeyboard = VirtualHidKeyboard(
            countryCode = 2,
            keyboardType = "iso"
        )
    )
