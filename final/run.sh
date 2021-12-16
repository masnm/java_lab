#!/bin/bash

set -xe

javac streamingexception/*.java StreamPlatform/*.java StreamPlatform/adir/*.java
java StreamPlatform.Main

rm streamingexception/*.class StreamPlatform/*.class StreamPlatform/adir/*.class
