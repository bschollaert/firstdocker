FROM openjdk:8-jdk-alpine
MAINTAINER Baudouin Schollaert
COPY target/firstdocker-member.jar /opt/spring-cloud/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/firstdocker-member.jar"]
EXPOSE 8088