FROM openjdk:11
EXPOSE 8089
ADD target/docker-project.jar docker-project.jar
ENTRYPOINT ["java","-jar","/docker-project.jar"]