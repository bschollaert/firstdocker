FROM postgres:11.1-alpine
MAINTAINER Baudouin Schollaert
ENV POSTGRES_USER userdocker
ENV POSTGRES_PASSWORD mypwd
ENV POSTGRES_DB firstdocker
COPY ./init/init.sql /docker-entrypoint-initdb.d/
EXPOSE 5432
