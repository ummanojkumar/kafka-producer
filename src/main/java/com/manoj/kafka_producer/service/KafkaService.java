package com.manoj.kafka_producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaService {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        CompletableFuture<SendResult<String, Object>> response = kafkaTemplate.send("mca3", message);
        response.whenComplete((res, ex) -> {
            if (ex != null) {
                System.out.println("Sent message =[ " + message + " ] with offset= [ " + res.getRecordMetadata().offset() + " ]");
            } else {
                System.out.println("Unable to send message= [" + message + "] due to : " + ex.getMessage());
            }
        });
    }

}
