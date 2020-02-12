#!/bin/sh
javac -d ./build -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar ./src/java/*.java
javac -d ./build -sourcepath ./src/java -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar ./test/java/*.java
java -classpath ./build -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeConnectorTest
java -classpath ./build RunEdgeConvert
