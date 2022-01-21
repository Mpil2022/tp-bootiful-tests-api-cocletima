# syntax=docker/dockerfile:1
FROM ubuntu:18.04
COPY . .
RUN echo "update"
RUN apt-get update
RUN echo "maven"
RUN apt-get install maven -y
RUN echo "run"
CMD mvn spring-boot:run