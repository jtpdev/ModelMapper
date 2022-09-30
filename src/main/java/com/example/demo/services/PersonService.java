package com.example.demo.services;

import com.example.demo.models.PersonModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final Random random;

    public PersonModel create(final PersonModel model) {
        return fakeSave(model);
    }

    private PersonModel fakeSave(final PersonModel model) {
        model.setId(random.nextInt());
        return model;
    }
}
