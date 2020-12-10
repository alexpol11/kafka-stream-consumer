package com.example.kafkastreamconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@EnableKafka
@SpringBootApplication
public class KafkaStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaStreamConsumerApplication.class, args);
    }

}
