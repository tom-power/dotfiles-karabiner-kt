#!/bin/sh
./gradlew build &&
cp -v ./app/build/karabiner.json ~/.config/karabiner/karabiner.json