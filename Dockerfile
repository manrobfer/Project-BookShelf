## FROM adoptopenjdk/openjdk:alpine
## FROM eclipse-temurin:11
FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/Bookshelf.jar
COPY ${JAR_FILE} books.jar
ENTRYPOINT ["java","-jar","/books.jar"]