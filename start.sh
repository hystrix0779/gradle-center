#!/usr/bin/env bash
gradle clean
gradle web:build
java -jar $(pwd)/web/build/libs/web-center.jar