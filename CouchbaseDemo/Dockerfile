FROM openjdk:8-jre-slim
COPY ./build/libs/CouchbaseDemo-0.0.1-SNAPSHOT.jar  /Sample/CouchDemo/
WORKDIR  /Sample/CouchDemo/
EXPOSE 8080
CMD ["java","-Dspring.couchbase.bootstrap-hosts=couchbase","-Dspring.couchbase.bucket.password=password","-jar","CouchbaseDemo-0.0.1-SNAPSHOT.jar"]


