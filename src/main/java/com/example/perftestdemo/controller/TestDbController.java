package com.example.perftestdemo.controller;

import com.example.perftestdemo.dto.TestDto;
import com.example.perftestdemo.service.TestDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/db")
@RequiredArgsConstructor
public class TestDbController {
    private final TestDbService testDbService;

    @GetMapping("/getAll")
    public Collection<TestDto> getAllItems() {
        return testDbService.getAllItems();
    }

    @PostMapping("/insert")
    public void insertItem(@RequestBody TestDto testDto) {
        testDbService.insert(testDto);
    }

    @DeleteMapping("/remove/{id}")
    public void removeById(@PathVariable("id") Long id) {
        testDbService.removeById(id);
    }

    @DeleteMapping("/removeAll")
    public void removeAll() {
        testDbService.removeAll();
    }
}
