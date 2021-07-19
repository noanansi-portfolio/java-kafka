# java-kafka
Simple application producing Kafka events

## Kafka
This example uses the Apache Kafka Docker images from Confluent. You must have docker-compose installed.

Warning: this config must be used only for development needs. It will run only one broker and a Zookeeper instance. 

### Executing Kafka
The docker-compose is located in the config/docker/local folder. You should execute it in background:

`docker-compose up -d`

### Creating a topic
Run the command below to create a new topic on the local cluster. Change the "MyTopic" to your topic name.

`docker-compose exec kafka kafka-topics --bootstrap-server localhost:9092 --topic MyTopic --create --partitions 3 --replication-factor 1`