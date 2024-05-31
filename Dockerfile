FROM openjdk:17-alpine
COPY build/libs/*.jar /app/
WORKDIR /app/
RUN mv /app/*.jar /app/app.jar

CMD ["java","-jar","app.jar"]
