package se.tp21.dotfiles.karabiner

import se.tp21.dotfiles.karabiner.profiles.profiles
import se.tp21.dotfiles.karabiner.profiles.shura
import sh.kau.karabiner.GlobalSettings
import sh.kau.karabiner.KarabinerConfig

fun karabinerConfig(): KarabinerConfig =
    KarabinerConfig(
        global = GlobalSettings(checkForUpdatesOnStartup = false),
        profiles = profiles().values.toList(),
    )