package com.example.perftestdemo.service;

import com.example.perftestdemo.dto.TestDto;
import com.example.perftestdemo.model.TestEntity;
import com.example.perftestdemo.repo.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class TestDbService {
    private final TestRepository testRepository;

    public Collection<TestDto> getAllItems() {
        return testRepository.findAll().stream()
                .map(item -> TestDto.builder()
                        .id(item.getId())
                        .name(item.getName())
                        .time(item.getTime())
                        .build())
                .collect(Collectors.toList());
    }

    public void insert(TestDto testDto) {
//        testRepository.insert(testDto.getName());
        testRepository.saveAndFlush(TestEntity.builder()
                .name(testDto.getName())
                .time(testDto.getTime())
                .build());
    }

    public void removeById(long id) {
        testRepository.deleteById(id);
    }

    public void removeAll() {
        testRepository.removeAll();
    }
}
