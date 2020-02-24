FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY ./ ./
EXPOSE 8085
ENTRYPOINT ["java","-jar","target/kong-0.0.1-SNAPSHOT.jar"]