FROM fabric8/java-ubi-openjdk11-jdk
COPY PixelAPIService.jar /usr/app/PixelAPIService.jar
WORKDIR /usr/app
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "PixelAPIService.jar"]