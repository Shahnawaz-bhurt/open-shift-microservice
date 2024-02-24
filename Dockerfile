FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8761
ARG JAR_FILE=target/open-shift-microservice-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} open-shift-microservice-0.0.1.jar
ENTRYPOINT ["java","-jar","/open-shift-microservice-0.0.1.jar"]
