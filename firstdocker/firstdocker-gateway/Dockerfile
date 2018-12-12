FROM openjdk:8-jdk-alpine
MAINTAINER Baudouin Schollaert
COPY target/firstdocker-gateway.jar /opt/spring-cloud/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/firstdocker-gateway.jar"]
EXPOSE 8888