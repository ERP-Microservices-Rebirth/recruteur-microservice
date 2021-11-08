FROM java:8
EXPOSE 8083
ADD /target/recruteur-microservice-0.0.1-SNAPSHOT.jar recruteur-microservice.jar
ENTRYPOINT [ "java", "-jar", "recruteur-microservice.jar" ]
