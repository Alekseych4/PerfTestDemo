package com.example.perftestdemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Builder
@Getter
@Setter
public class TestDto {
    private long id;
    private String name;
    private OffsetDateTime time;
}
