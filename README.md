
# Kafka Setup Guide

## 1. Start Zookeeper

Navigate to the Kafka folder in the command prompt:

```bash
cd C:/kafka/kafka_2.13-3.8.0
```

Start Zookeeper using one of the following commands:

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

OR

```bash
C:\kafka\kafka_2.13-3.8.0\bin\windows\zookeeper-server-start.bat C:\kafka\kafka_2.13-3.8.0\config\zookeeper.properties
```

- **Zookeeper default port:** `2181`    

---

## 2. Start Kafka Server

Open the command prompt, navigate to the Kafka folder, and start the Kafka server:

```bash
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

- **Kafka default port:** `9092`

---

## 3. Create a Kafka Topic

To create a new topic, use the following command:

```bash
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic mca1 --partitions 3 --replication-factor 1
```

---

## 4. List All Topics

To list all the Kafka topics:

```bash
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list
```

---

## 5. Describe a Specific Topic

To describe the topic `mca1`:

```bash
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic mca1
```

---

## 6. Create a Kafka Producer

To create a producer for the `mca1` topic:

```bash
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic mca1
```

---

## 7. Load Data to Kafka Producer from a CSV File

To load data from a CSV file to the producer:

```bash
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic mca1 < C:\kafka\customers-10000.csv
```

---

## 8. Create a Kafka Consumer

To create a consumer for the `mca1` topic that reads messages from the beginning:

```bash
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic mca1 --from-beginning
```

---

### Ports Overview

- **Zookeeper Port:** `2181`
- **Kafka Port:** `9092`
