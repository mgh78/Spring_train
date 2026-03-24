package com.example.Learn.lombook;


import lombok.Builder;
import lombok.Getter;

import java.util.spi.ToolProvider;

@Builder(toBuilder = true)
@Getter
public class Home {
    private String address;
    private int windows;
    private String description;


}


