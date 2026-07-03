package se.tp21.dotfiles.karabiner.profiles.devices

import sh.kau.karabiner.*

fun deviceConfigurationYoda() =
    DeviceConfiguration(
        identifiers = deviceIdentifierYoda(),
//        simpleModifications = simpleModificationsYoda(),
    )

fun deviceIdentifierYoda() =
    DeviceIdentifier(
        isKeyboard = true,
        vendorId = 1241,
        productId = 355,
    )

/**
 * now done with https://github.com/tom-power/tex_yoda_2_configurator_runner
 */
//private fun simpleModificationsYoda() =
//    listOf(
//        SimpleModification(
//            from =
//                SimpleModificationKey(
//                    keyCode = ModifierKeyCode.LeftOption,
//                ),
//            to =
//                listOf(
//                    SimpleModificationValue(
//                        keyCode = ModifierKeyCode.LeftCommand,
//                    )
//                )
//        ),
//        SimpleModification(
//            from =
//                SimpleModificationKey(
//                    keyCode = ModifierKeyCode.LeftCommand,
//                ),
//            to =
//                listOf(
//                    SimpleModificationValue(
//                        keyCode = ModifierKeyCode.LeftOption,
//                    )
//                )
//        )
//    )