package se.tp21.dotfiles.karabiner.profiles

import se.tp21.dotfiles.karabiner.profiles.utils.base
import sh.kau.karabiner.*

fun macbook(): Profile =
    Profile(
        name = "macbook",
        complexModifications = ComplexModifications(
            rules = base()
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
