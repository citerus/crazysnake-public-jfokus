#bin/bash

mvn -f brain.archetype/pom.xml install
mvn archetype:generate -DarchetypeGroupId=se.citerus.crazysnake -DarchetypeArtifactId=brain.archetype -DarchetypeVersion=0.0.1