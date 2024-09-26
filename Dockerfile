# Use a base image with Java 17
FROM bellsoft/liberica-openjdk-alpine:17

# Set working directory
WORKDIR /app

# Copy the Java application JAR file into the image
COPY target/parsermock-0.0.1-SNAPSHOT.jar /app/app.jar

# Define the command to run the Java application
CMD ["java", "-jar", "app.jar"]