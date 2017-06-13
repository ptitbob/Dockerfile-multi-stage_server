FROM maven:3.5.0-jdk-8 as builder
WORKDIR /usr/src/mymaven
COPY pom.xml /usr/src/mymaven
COPY src /usr/src/mymaven/src
RUN mvn -f /usr/src/mymaven/pom.xml clean package


FROM openjdk:8u131-jre-alpine
WORKDIR /root/
COPY --from=builder /usr/src/mymaven/target/pingserver-0.9.0-docker.jar /root/
CMD java -jar pingserver-0.9.0-docker.jar