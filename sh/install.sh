#!/bin/sh
./gradlew build &&
cp ./app/build/karabiner.json ~/.config/karabiner/karabiner.json &&
echo "Successfully copied json to $HOME/.config/karabiner/karabiner.json"