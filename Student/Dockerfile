FROM maven:3.8.1-openjdk-17 as Build
COPY . .
RUN mvn package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Student-0.0.1-SNAPSHOT.jar Student.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","Student.jar"]