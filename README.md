# springboot-kafka
Learn Apache Kafka

## learning sources : 
- [**Programmer Zaman Now**](https://www.youtube.com/watch?v=JTuGhqdhl68&list=PL-CtdCApEFH8dJMuQGojbjUdLEty8mqYF&index=8)
- [**Javainuse**](https://www.javainuse.com/messaging/kafka/architecture)


### Notes :
- *Direkomendasikan jumlah partisi yang dibuat sama dengan atau lebih dari jumlah aplikasi pada sebuah group consumer*


### Kafka command :
- Membuat topic di windows :
	.\bin\windows\kafka-topics.bat --create --topic testsecond-topic --bootstrap-server localhost:9092 --partitions 2

- Melihat list topic yang sudah dibuat : 
	.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092