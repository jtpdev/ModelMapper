package com.example.demo.dtos;

import java.io.Serializable;

public record PersonDTO(
        String name,
        Integer age
) implements Serializable {
}
