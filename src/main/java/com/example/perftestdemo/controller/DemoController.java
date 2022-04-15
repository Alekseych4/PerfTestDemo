package com.example.perftestdemo.controller;

import com.example.perftestdemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/simple-get")
    public ResponseEntity<String> simpleGet() {
        return ResponseEntity.ok(demoService.getString());
    }

    @GetMapping("/get-with-latency")
    public ResponseEntity<String> getWithLatency() {
        return ResponseEntity.ok(demoService.getStringWithLatency());
    }
}
