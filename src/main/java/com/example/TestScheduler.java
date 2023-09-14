package com.example;

import io.micronaut.retry.annotation.Retryable;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@Singleton
public class TestScheduler {

    private Logger logger = LoggerFactory.getLogger(TestScheduler.class);

    @Scheduled(fixedDelay = "5s")
    @Retryable
    public void run() {
        logger.info("Result: " + new Random().nextInt());
    }
}
