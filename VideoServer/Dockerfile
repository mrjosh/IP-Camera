# Use OpenJDK 11 as the base image
FROM openjdk:11-jdk

# Set the working directory in the container
WORKDIR /app

# Copy all files
COPY . .

# Give execution permissions to gradlew
RUN chmod +x gradlew

# Build the application
RUN ./gradlew build

# Expose the ports for both servers
EXPOSE 4321 4444

# Set the entrypoint to gradlew
ENTRYPOINT ["./gradlew"]