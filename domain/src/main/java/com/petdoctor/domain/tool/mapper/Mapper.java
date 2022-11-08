package com.petdoctor.domain.tool.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public interface Mapper<E, M, D> {

    E toEntityFromModel(M model);

    M toModelFromEntity(E entity);

    M toModelFromDto(D dto);

    D toDtoFromModel(M model);
}
