# springboot-kafka
Learn Apache Kafka

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
3. create topic : 
    .\bin\windows\kafka-topics.bat --create --topic testsecond-topic --bootstrap-server localhost:9092 --partitions 2
4. lihat list topic yang sudah terbuat : 
    .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

### Notes :
- *Direkomendasikan jumlah partisi yang dibuat sama dengan atau lebih dari jumlah aplikasi pada sebuah group consumer*



### Kafka command :
- Membuat topic di windows :
	.\bin\windows\kafka-topics.bat --create --topic testsecond-topic --bootstrap-server localhost:9092 --partitions 2

- Melihat list topic yang sudah dibuat : 
	.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092