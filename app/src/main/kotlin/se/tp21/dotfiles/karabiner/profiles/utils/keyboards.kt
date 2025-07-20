package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.VirtualHidKeyboard

fun keyboardAnsi(): VirtualHidKeyboard =
    VirtualHidKeyboard(
        countryCode = 2,
        keyboardType = "ansi"
    )