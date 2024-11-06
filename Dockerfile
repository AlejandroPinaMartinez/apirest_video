FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/apirest_video-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} apirest_video.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "apirest_video.jar"]
