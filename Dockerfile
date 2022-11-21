FROM openjdk:8-jdk-alpine

ARG JAR_FILE=./build/libs/*.jar

COPY ${JAR_FILE} springbootapp.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=live", "-jar", "/springbootapp.jar"]