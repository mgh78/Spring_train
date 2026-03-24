package com.example.Learn.lombook;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Home {
    private String address;
    private int windows;
    private String description;
}


