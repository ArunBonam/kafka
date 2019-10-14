####Creating couchbase image####
1.build the image using docker file avaialeble in /Users/arunbonam/Documents/couch-docker
2.run docker compose file for couchbase db to start 
3.docker-compose run -d --service-ports --name couchbase couchbase [bring both spring boot and couchbase to same network [custom bridge network]]
4.verify localhost:8091
5.create SAMPLE bucket with username as bucket name and password as password




###SPRING APP####

1.build the image from docker file available in /Downloads/CouchbaseDemo
2.in docker file makes sure application.properties are overridden with -Dprops

3.run docker compose file for spring-boot to start in the same network
4.verify by posting json to localhost:8080/employee/add .




 
