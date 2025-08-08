package se.tp21.dotfiles.karabiner.profiles.utils

import se.tp21.karabiner.snippets.SnippetRules
import se.tp21.karabiner.snippets.complexModificationsFrom
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.SimpleModification
import sh.kau.karabiner.SimpleModificationKey
import sh.kau.karabiner.SimpleModificationValue
import sh.kau.karabiner.json
import java.io.File

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