package com.example.demo.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.core.ParameterizedTypeReference;

public interface Mapper<D, M> {

    ModelMapper getModelMapper();

    default M toModel(final D source) {
        return getModelMapper().map(
                source,
                new ParameterizedTypeReference<M>() {}.getType()
        );
    }

    default D toDto(final M source) {
        return getModelMapper().map(
                source,
                new ParameterizedTypeReference<D>() {}.getType()
        );
    }

}
