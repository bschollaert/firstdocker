FROM openjdk:8-jdk-alpine
MAINTAINER Baudouin Schollaert
RUN mkdir /data
WORKDIR /data
ADD target/firstdocker-eureka.jar /data/firstdocker-eureka.jar

ENV springprofiles="" \
    MAXRAMIFNOLIMIT=4096
ENTRYPOINT MAXRAM=$(expr `cat /sys/fs/cgroup/memory/memory.limit_in_bytes` / 1024 / 1024) && \
           MAXRAM=$(($MAXRAM>$MAXRAMIFNOLIMIT?$MAXRAMIFNOLIMIT:$MAXRAM))m && \
           echo "MaxRam: $MAXRAM" && \
           java -XX:MaxRAM=$MAXRAM -Djava.security.egd=file:/dev/./urandom -jar -Dspring.profiles.active="$springprofiles" firstdocker-eureka.jar
EXPOSE 8761