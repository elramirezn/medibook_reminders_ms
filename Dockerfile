# Use an official OpenJDK runtime as a parent image
FROM openjdk:17


# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file from your local build context into the container
COPY target/reminders_ms-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application listens on (replace with your application's port)
EXPOSE 8080

# Specify the command to run when the container starts
CMD ["java", "-jar", "app.jar"]