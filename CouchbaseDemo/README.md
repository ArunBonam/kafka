####Creating couchbase image####
build the image using docker file avaialeble in /Users/arunbonam/Documents/couch-docker
run docker compose file for couchbase db to start 
docker-compose run -d --service-ports --name couchbase couchbase [bring both spring boot and couchbase to same network [custom bridge network]]
verify localhost:8091
create SAMPLE bucket with username as bucket name and password as password




###SPRING APP####

build the image from docker file available in /Downloads/CouchbaseDemo
in docker file makes sure application.properties are overridden with -Dprops

run docker compose file for spring-boot to start in the same network
verify by posting json to localhost:8080/employee/add 




 
