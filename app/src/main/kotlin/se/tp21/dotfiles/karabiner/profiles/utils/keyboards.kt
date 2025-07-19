package se.tp21.dotfiles.karabiner.profiles.utils

import sh.kau.karabiner.VirtualHidKeyboard

fun keyboardIso(): VirtualHidKeyboard =
    VirtualHidKeyboard(
        countryCode = 2,
        keyboardType = "iso"
    )

fun keyboardAnsi(): VirtualHidKeyboard =
    VirtualHidKeyboard(
        countryCode = 2,
        keyboardType = "ansi"
    )