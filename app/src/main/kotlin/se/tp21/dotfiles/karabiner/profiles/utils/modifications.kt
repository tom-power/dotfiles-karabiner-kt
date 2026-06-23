package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.*

fun simpleModificationsGlobal(): List<SimpleModification> =
    listOf(
        SimpleModification(
            from =
                SimpleModificationKey(
                    keyCode = KeyCode.CapsLock,
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
                    keyCode = KeyCode.NonUsBackslash, // §
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = KeyCode.GraveAccentAndTilde, // `~
                    )
                )
        )
    )