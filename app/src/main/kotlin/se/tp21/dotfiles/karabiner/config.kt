package se.tp21.dotfiles.karabiner

import sh.kau.karabiner.GlobalSettings
import sh.kau.karabiner.KarabinerConfig
import sh.kau.karabiner.KarabinerRule

fun karabinerConfig(snippetRules: List<KarabinerRule>): KarabinerConfig =
    KarabinerConfig(
        global =
            GlobalSettings(
                checkForUpdatesOnStartup = false,
            ),
        profiles = profiles(snippetRules).values.toList(),
    )