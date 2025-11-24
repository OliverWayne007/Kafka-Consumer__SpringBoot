package com.rumi.springbootkafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService
{
    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "location-updates", groupId = "driver-location-consumer-group-1")
    public void listenOnConsumer1(String driverLocationMessage)
    {
        log.info("Message consumed from Kafka-Topic: {} by consumer-1: ", driverLocationMessage);
    }

    @KafkaListener(topics = "location-updates", groupId = "driver-location-consumer-group-1")
    public void listenOnConsumer2(String driverLocationMessage)
    {
        log.info("Message consumed from Kafka-Topic: {} by consumer-2: ", driverLocationMessage);
    }
}
