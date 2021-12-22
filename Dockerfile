FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
RUN 
ENTRYPOINT ["java","-jar","/app.jar"]