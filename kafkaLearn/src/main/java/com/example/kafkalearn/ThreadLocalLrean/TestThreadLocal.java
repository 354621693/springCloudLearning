package com.example.kafkalearn.ThreadLocalLrean;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author leewencan
 * @date 2022/6/30 11:33
 */
public class TestThreadLocal {
    public static final Integer SIZE = 500;
    static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            5, 5, 1,
            TimeUnit.MINUTES, new LinkedBlockingDeque<>());

    static class LocalVariable {
        //5 M
        private byte[] locla = new byte[1024 * 1024 * 5];
    }

    static ThreadLocal<LocalVariable> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        try {
            for (int i = 0; i < SIZE; i++) {
                int finalI = i;
                executor.execute(() -> {
                    threadLocal.set(new LocalVariable());
//                    new LocalVariable();
                    System.out.println("开始执⾏"+ finalI+"----"+threadLocal.get());
                });
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
