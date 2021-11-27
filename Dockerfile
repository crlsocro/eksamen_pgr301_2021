FROM maven:3.6-jdk-11 as builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B  package

FROM adoptopenjdk/openjdk11:alpine-slim
COPY --from=builder /app/target/*.jar /app/eksamen_pgr301_20211-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/eksamen_pgr301_20211-1.0-SNAPSHOT.jar"]