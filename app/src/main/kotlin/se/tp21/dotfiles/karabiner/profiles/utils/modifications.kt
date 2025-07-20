package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.SimpleModification
import sh.kau.karabiner.SimpleModificationKey
import sh.kau.karabiner.SimpleModificationValue

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
                    keyCode = KeyCode.NonUsBackslash,
                ),
            to =
                listOf(
                    SimpleModificationValue(
                        keyCode = KeyCode.GraveAccentAndTilde,
                    )
                )
        )
    )