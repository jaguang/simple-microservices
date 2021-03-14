FROM openjdk:11
ADD target/verification-service.jar verification-service.jar
EXPOSE 8072
ENTRYPOINT ["java", "-jar", "verification-service.jar"]