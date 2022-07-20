package com.leemanshow.rokectmq.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class KafkaSyncProducerController {
    @Autowired
    KafkaTemplate<Integer, String> kafkaTemplate;

    @RequestMapping("/kafka/producer/send/{content}")
    public String send(@PathVariable String content) {
        ListenableFuture<SendResult<Integer, String>> future = kafkaTemplate.send("test1", 1, 0, "ddd");

        try {
            SendResult<Integer, String> result = future.get();
            RecordMetadata recordMetadata = result.getRecordMetadata();

            log.info("{},{},{}", recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset());
        } catch (InterruptedException | ExecutionException e) {
            log.error("", e);
        }
        return "success";
    }

    public static void main(String a[]) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 30,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(5), new ThreadPoolExecutor.AbortPolicy());

        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.print("dd"+Thread.currentThread().getName());
            }
        });


    }
}
