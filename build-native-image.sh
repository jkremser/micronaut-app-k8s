./gradlew clean assemble
native-image -H:-UseCompressedReferences --no-server -cp build/libs/*-all.jar
