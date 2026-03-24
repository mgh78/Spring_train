package com.example.Learn.lombook;


import jakarta.annotation.Nonnull;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Nonnull


public class Student {

    private  final String name;
    private final int age;

}
