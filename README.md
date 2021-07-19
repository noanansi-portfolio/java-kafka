# java-kafka
Simple application producing Kafka events

## Kafka
This example uses the Apache Kafka Docker images from Confluent. You must have docker-compose installed.

Warning: this config must be used only for development needs. It will run only one broker and a Zookeeper instance. 

### Executing Kafka
The docker-compose is located in the config/docker/local folder. You should execute it in background:

`docker-compose up -d`