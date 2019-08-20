package com.github.dominaspl.springbootapp.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class AlienDTO {

    private Long id;
    @Size(min = 3, max = 15)
    private String name;
    @Size(min = 2, max = 20)
    private String tech;

}
