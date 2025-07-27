# [karabiner](https://karabiner-elements.pqrs.org/) config using [karabiner-kt](https://github.com/tom-power/karabiner-kt)

Personal [karabiner](https://karabiner-elements.pqrs.org/) config built using a [fork](https://github.com/tom-power/karabiner-kt) of [karabiner-kt](https://github.com/kaushikgopal/karabiner-kt), and rules ported separately:

- [right-shift-vi-like-karabiner-kt](https://github.com/tom-power/right-shift-vi-like-karabiner-kt)
- [sixty-percent-karabiner-kt](https://github.com/tom-power/sixty-percent-karabiner-kt)
- [larks-karabiner-kt](https://github.com/tom-power/larks-karabiner-kt)
- [snippets-karabiner-kt](https://github.com/tom-power/snippets-karabiner-kt)

it's been lots of fun, and helped simplify/get a better understanding of my config.

## installation

```shell
clone https://github.com/tom-power/dotfiles-karabiner-kt.git
cd dotfiles-karabiner-kt
cp app/src/main/resources/example.snippetRules.json app/src/main/resources/snippetRules.json
nano app/src/main/resources/snippetRules.json # add snippet rules if you like
sh/install.sh
```
