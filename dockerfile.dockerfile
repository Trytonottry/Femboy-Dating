FROM openjdk:11-jre-slim
VOLUME /tmp
COPY target/swipe-match.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]