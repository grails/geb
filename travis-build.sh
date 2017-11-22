#!/bin/bash
set -e
rm -rf *.zip
./gradlew clean test assemble

filename=$(find build/libs -name "*.jar" | head -1)
filename=$(basename "$filename")

EXIT_STATUS=0
echo "Publishing archives for branch $TRAVIS_BRANCH"
echo "Publishing archives"

./gradlew bintrayUpload || EXIT_STATUS=$?

exit $EXIT_STATUS
