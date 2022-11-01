package com.petdoctor.domain.tool.mapper.impl;

import com.petdoctor.data.entity.DoctorEntity;
import com.petdoctor.domain.dto.DoctorDto;
import com.petdoctor.domain.model.doctor.Doctor;
import com.petdoctor.domain.model.doctor.DoctorInfo;
import com.petdoctor.domain.model.doctor.DoctorInterface;
import com.petdoctor.domain.tool.mapper.AbstractMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper extends AbstractMapper<DoctorEntity, Doctor, DoctorDto> {


    DoctorMapper(Class<DoctorEntity> entityClass, Class<Doctor> modelClass, Class<DoctorDto> dtoClass) {
        super(entityClass, modelClass, dtoClass);
    }

    @Override
    protected void mapSpecificFieldsToModelFromEntity(DoctorEntity source, Doctor destination) {

    }

    @Override
    protected void mapSpecificFieldsToEntityFromModel(Doctor source, DoctorEntity destination) {

    }

    @Override
    protected void mapSpecificFieldsToDtoFromModel(Doctor source, DoctorDto destination) {

    }

    @Override
    protected void mapSpecificFieldsToModelFromDto(DoctorDto source, Doctor destination) {

    }


}
