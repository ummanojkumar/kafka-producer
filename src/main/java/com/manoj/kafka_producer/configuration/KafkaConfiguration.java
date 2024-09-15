package com.manoj.kafka_producer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
    /*
        create new topic if not exists
     */
    @Bean
    public NewTopic createTopic() {
        return new NewTopic("mca3", 3, (short) 1);
    }
}
