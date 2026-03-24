package com.example.Learn.lombook;


import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Nonnull

public class Student {

    private String name;
    private int age;

}
