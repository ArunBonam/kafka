FROM java:8
COPY ./build/libs/*.jar /SAMPLE/KafkaConsumer/app.jar
WORKDIR /SAMPLE/KafkaConsumer/
ENTRYPOINT ["java","-jar","app.jar"]
