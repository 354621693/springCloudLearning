package com.example.kafkalearn.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

/**
 * @author leewencan
 * @date 2022/6/27 8:49
 */
@RestController
@Slf4j
public class KafkaSyncProducerController {

    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Autowired
    KafkaTemplate<Integer, String> template;

    /**
     * 生产端的属性封装
     */
    public static Properties getProducerProperties() {
        //属性
        Properties props = new Properties();
        /**
         *  参数说明： props.put("bootstrap.servers", "192.168.43.152:9092,192.168.43.152:9093");
         *  该参数指定连接的broker，如果集群中broker很多的话，只需要指定部分即可，指定多个的原因是因为怕其中一个挂了之后
         *  producer客户端还能通过其他的ip:port找到集群
         * 必输
         */
        props.put("bootstrap.servers", "localhost:9092");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        /**
         * 参数是为消息做序列化用的，任何消息都必须是字节数组才能发送到broker上，
         * 将一个String字符串转成字节数组
         * 必输
         */
        props.put("key.serializer", StringSerializer.class.getName());
        /**
         * 必输
         */
        props.put("value.serializer", StringSerializer.class.getName());
        return props;
    }

    @GetMapping("/kafka/syncSend/{content}")
    public String send(@PathVariable String content) {
        log.info("{}", content);
        ListenableFuture<SendResult<Integer, String>> future = template.send("test1", 1, 1, content);
        try {
            SendResult<Integer, String> sendResult = future.get(1, TimeUnit.SECONDS);
            RecordMetadata recordMetadata = sendResult.getRecordMetadata();
            log.info("{},{},{}", recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            log.error("error while sending", e);
        }
        return "success";
    }



    public static void main(String a[]){
        A aa = new A(1);
        A ba = new A(2);
        ArrayList<A> objects = new ArrayList<>();
        objects.add(aa);
        objects.add(ba);
        objects.add(new A(3));
        objects.add(new A(4));
        if(objects.size()>1){
            List<A> sorted = objects.stream().sorted(Comparator.comparing(A::getA)).collect(Collectors.toList());
            System.out.print(sorted.get(0).getA());
        }
    }

    static class A{
        Integer a;

        public Integer getA() {
            return a;
        }

        public A(int a) {
            this.a = a;
        }
    }
}
