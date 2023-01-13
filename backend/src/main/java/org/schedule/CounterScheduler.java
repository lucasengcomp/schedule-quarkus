package org.schedule;


import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class CounterScheduler {

    private AtomicInteger counter = new AtomicInteger();

    public int get() {
        return counter.get();
    }

    @Scheduled(every = "10s")
    void incrementEach10s() {
        counter.incrementAndGet();
    }
}
