package com.example.perftestdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String getString() {
        return "Hello, demo perf user!";
    }

    public String getStringWithLatency() {
        try {
            Thread.sleep(5000);
            return String.format("It was a hard task by %s", Thread.currentThread().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "Exception occurred!";
        }
    }
}
