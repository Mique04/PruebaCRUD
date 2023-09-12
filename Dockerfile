
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template - alpine:latest

FROM openjdk:17
volume /temp
EXPOSE 8080
ADD ./target/CRUD-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar" ]

CMD ["/bin/sh"]
