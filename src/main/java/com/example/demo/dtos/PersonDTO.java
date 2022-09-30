package com.example.demo.dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO implements Serializable {
    private String name;
    private Integer age;

}
