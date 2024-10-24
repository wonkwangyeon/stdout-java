FROM openjdk:17.0.1-slim

COPY ./build/libs/stdout-0.0.1-SNAPSHOT.jar stdout.jar

ENTRYPOINT ["java", "-jar", "stdout.jar"]
