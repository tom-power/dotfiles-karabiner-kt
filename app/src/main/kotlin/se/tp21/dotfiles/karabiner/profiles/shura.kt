package se.tp21.dotfiles.karabiner.profiles

import se.tp21.rightshiftvilike.karabiner.rightshiftvilike.rightShiftViLike
import sh.kau.karabiner.*

fun shura(): Profile {
    return Profile(
        name = "shura",
        complexModifications = ComplexModifications(
            rules =
                rightShiftViLike().rules
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
}
