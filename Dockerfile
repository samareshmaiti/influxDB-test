FROM openjdk:11
ADD ./target/influxDB-Test-0.1.0.jar /usr/src/influxDB-Test-0.1.0.jar
EXPOSE 8086
WORKDIR usr/src
ENTRYPOINT ["java","-jar","influxDB-Test-0.1.0.jar"]