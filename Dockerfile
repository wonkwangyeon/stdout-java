FROM openjdk:17-alpine
CMD ["./gradlew", "clean", "build"]
COPY ./build/libs/stdout-0.0.1-SNAPSHOT.jar stdout.jar
ENTRYPOINT ["java", "-jar", "stdout.jar"]