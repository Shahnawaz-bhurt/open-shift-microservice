FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8761
ARG JAR_FILE=target/microservice2-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} microservice2-0.0.1.jar
ENTRYPOINT ["java","-jar","/microservice2-0.0.1.jar"]