FROM maven:3.8.3-openjdk-17 AS build

WORKDIR /app
COPY ./target/email-sender-times-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

CMD ["java", "-jar", "email-sender-times-0.0.1-SNAPSHOT.jar"]