package com.example.springrediskafkademo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "group-id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

