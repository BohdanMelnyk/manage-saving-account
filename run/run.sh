#!/bin/bash
cd .. || exit
cd saving-service || exit
./gradlew clean build
cd .. || exit

cd gateway || exit
./gradlew clean build
cd .. || exit

cd run || exit
docker-compose down -v
docker-compose up --build
cd .. || exit