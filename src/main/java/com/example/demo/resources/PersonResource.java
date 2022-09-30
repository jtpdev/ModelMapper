package com.example.demo.resources;

import com.example.demo.dtos.PersonDTO;
import com.example.demo.mappers.PersonMapper;
import com.example.demo.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonResource {

    private final PersonMapper mapper;
    private final PersonService service;

    @PostMapping
    public ResponseEntity<PersonDTO> create(@RequestBody final PersonDTO dto) {
        final var model = mapper.toModel(dto);
        final var savedModel = service.create(model);
        final var responseDTO = mapper.toDto(savedModel);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping("/multiple")
    public ResponseEntity<List<PersonDTO>> create(@RequestBody final List<PersonDTO> dtos) {
        final var model = dtos.stream().map(mapper::toModel).toList();
        final var savedModel = model.stream().map(service::create).toList();
        final var responseDTO = savedModel.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(responseDTO);
    }
}
