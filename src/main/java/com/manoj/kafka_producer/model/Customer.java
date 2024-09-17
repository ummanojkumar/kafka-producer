package com.manoj.kafka_producer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private String name;
    private String age;
    private String gender;
    private String  mobileNumber;
}
