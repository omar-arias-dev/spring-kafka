# Commands for Kafka

Start Zookeeper Server: `bin/zookeeper-server-start.sh config/zookeeper.properties`

Start Kafka Server: `bin/kafka-server-start.sh config/server.properties`

Create topic: `bin/kafka-topics.sh --create --topic example-topic --bootstrap-server localhost:9092`

Show topic: `bin/kafka-topics.sh --describe --topic example-topic --bootstrap-server localhost:9092`

List topics: `bin/kafka-topics.sh --list --bootstrap-server localhost:9092`

Provider: `bin/kafka-console-producer.sh --topic example-topic --bootstrap-server localhost:9092`

Consumer: `bin/kafka-console-consumer.sh --topic example-topic --from-beginning --bootstrap-server localhost:9092`