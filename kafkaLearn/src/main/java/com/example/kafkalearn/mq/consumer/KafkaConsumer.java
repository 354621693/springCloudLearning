package com.example.kafkalearn.mq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author leewencan
 * @date 2022/6/27 9:11
 */
@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "test1")
    public void onMessage(ConsumerRecord<Integer,String> record){
        log.info("{}，{}，{}，{}，{}",record.topic(),record.partition(),record.offset(),record.key(),record.value());
    }
}
