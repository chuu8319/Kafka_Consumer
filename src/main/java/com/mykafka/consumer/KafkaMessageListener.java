package com.mykafka.consumer;

import com.mykafka.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

//    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
//    public void consume(String message) {
//        log.info("consumer1 consume the message {} ", message);
//    }
//    @KafkaListener(topics = "${topic.name}",groupId = "${spring.kafka.consumer.group-id}")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "${topic.name}",groupId = "${spring.kafka.consumer.group-id}")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "${topic.name}",groupId = "${spring.kafka.consumer.group-id}")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
    @KafkaListener(topics = "${topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumeObject(Customer customer) {
        log.info("consumer consume the Customer Object {} ", customer.toString());
    }
}