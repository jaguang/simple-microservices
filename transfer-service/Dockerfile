FROM openjdk:11
ADD target/transfer-service.jar transfer-service.jar
EXPOSE 8071
ENTRYPOINT ["java", "-jar", "transfer-service.jar"]