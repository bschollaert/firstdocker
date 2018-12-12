FROM openjdk:8-jdk-alpine
MAINTAINER Baudouin Schollaert
COPY target/firstdocker-eureka.jar /opt/spring-cloud/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/firstdocker-eureka.jar"]
EXPOSE 8761