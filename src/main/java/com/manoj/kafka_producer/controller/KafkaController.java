package com.manoj.kafka_producer.controller;

import com.manoj.kafka_producer.model.Customer;
import com.manoj.kafka_producer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {
    @Autowired
    KafkaService kafkaService;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> sendMessage(@PathVariable String message) {
        try {
            kafkaService.sendMessage(message);
            return ResponseEntity.ok("message published successfully..");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/publish")
    public ResponseEntity<?> sendCustomerDetails(@RequestBody Customer customer) {
        try {
            kafkaService.sendCustomerDetails(customer);
            return ResponseEntity.ok("message published successfully..");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
