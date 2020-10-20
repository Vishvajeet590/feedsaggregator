# REST API - mongo backend

REST API with mongo backend and in-memory caching.

## REST API

REST API description
* `/rest/v1/search` - get latest blog posts (order by published desc)
    optional parameters:
  * from=0
  * size=10 - limit of blog posts. Maximum is 100.
  * sort=[asc|desc] (default desc)
  * feed=feed_name - filter posts only given feed 
  * group=group_name - filter posts only for given group
* `/rest/v1/post/{id}` - get post based on its `_id` in mongo
* `/health/live` - liveness check
* `/health/ready` - readiness check. If MongoDB is down the check is down as well.

Example Search:

* http://localhost:8080/rest/v1/search?size=10&group=keycloak
* http://localhost:8080/rest/v1/post/5f858efcd36cf88d1ff331a4

## Configuration

The app is configurable in Quarkus way. Any of [application.properties](src/main/resources/application.properties) can be overwritten.
The most important are:
* `quarkus.mongodb.connection-string` - mongo db connection string. See [Configuration reference](https://quarkus.io/guides/mongodb#configuration-reference)
* `app.mongo.db` - DB name
* `app.mongo.collection` - Collection name

## How to run app

The application is runnable using `java -jar target/restapi-mongo-runner.jar`.