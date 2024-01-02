FROM openjdk:17
EXPOSE 8082
ADD target/entwickler-integration.jar entwickler-integration.jar
ENTRYPOINT ["java", "-jar", "/entwickler-integration.jar"]