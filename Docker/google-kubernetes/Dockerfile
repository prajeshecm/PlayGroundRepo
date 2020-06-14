FROM openjdk:8
RUN mkdir /usr/app
COPY  ./target/gkubernetes-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app
RUN sh -c 'touch gkubernetes-0.0.1-SNAPSHOT.jar'
EXPOSE 8090
ENTRYPOINT ["java","-jar","gkubernetes-0.0.1-SNAPSHOT.jar"]