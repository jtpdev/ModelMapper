package com.example.demo.mappers;

import com.example.demo.dtos.PersonDTO;
import com.example.demo.models.PersonModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonMapper implements Mapper<PersonDTO, PersonModel>{

    private final ModelMapper modelMapper;
    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
