# springboot-kafka
Learn Apache Kafka

##
Kafka - Producer

## learning sources : 
- [**Programmer Zaman Now**](https://www.youtube.com/watch?v=JTuGhqdhl68&list=PL-CtdCApEFH8dJMuQGojbjUdLEty8mqYF&index=8)
- [**Javainuse**](https://www.javainuse.com/messaging/kafka/architecture)

### Version of system
- Java : 1.8
- Kafka : 2.13-3.3.1
- SO : Windows 10


### How to Run :
1. run zookeper : 
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
	
2. run kafka : 
    .\bin\windows\kafka-server-start.bat .\config\server.properties
	
3. membuat producer dan consumer dengan kafka console : 
3.1. create topic : 
    .\bin\windows\kafka-topics.bat --create --topic testsecond-topic --bootstrap-server localhost:9092 --partitions 2
	
3.2. lihat list topic yang sudah terbuat :\n 
    .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
	
3.3. membuat producer : 
	.\bin/kafka-console-producer.bat --topic testfirst-topic --bootstrap-server localhost:9092
	
3.4. membuat consumer :
	.\bin\windows\kafka-console-consumer.bat --topic testfirst-topic --from-beginning --bootstrap-server localhost:9092
	
	- command --from-beginning adalah optional untuk melihat keseluruhan data yang sudah di produce dari awal


4. membuat producer dan consumer dengan java :


4.1. tambahkan dependency kafka client, can see doc [here](https://kafka.apache.org/33/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html)
4.1. create class producer, create main method : 
4.2. bila belum memiliki class consumer bisa run consumer dengan console consumer kafka seperti perintah di point 3.4


### Notes :
- *Direkomendasikan jumlah partisi yang dibuat sama dengan atau lebih dari jumlah aplikasi pada sebuah group consumer*



### Kafka command :
- Membuat topic di windows :
	.\bin\windows\kafka-topics.bat --create --topic testsecond-topic --bootstrap-server localhost:9092 --partitions 2

- Melihat list topic yang sudah dibuat : 
	.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092