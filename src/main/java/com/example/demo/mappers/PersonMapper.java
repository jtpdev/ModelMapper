package com.example.demo.mappers;

import com.example.demo.dtos.PersonDTO;
import com.example.demo.models.PersonModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonMapper implements Mapper<PersonDTO, PersonModel>{

    private final ModelMapper modelMapper;
    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

//    If it'll be uncommented mapping works
//    @Override
//    public PersonModel toModel(PersonDTO source) {
//        return getModelMapper().map(
//                source,
//                new ParameterizedTypeReference<PersonModel>() {}.getType()
//        );
//    }
//
//    @Override
//    public PersonDTO toDto(PersonModel source) {
//        return getModelMapper().map(
//                source,
//                new ParameterizedTypeReference<PersonDTO>() {}.getType()
//        );
//    }
}
