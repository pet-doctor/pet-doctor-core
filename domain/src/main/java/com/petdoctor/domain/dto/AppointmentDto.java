package com.petdoctor.domain.dto;

import com.petdoctor.data.entity.AppointmentState;

import java.time.LocalDate;

public class AppointmentDto {
    private Long id;
    private LocalDate startTime;
    private AppointmentState appointmentState;
    private ClientDto client;
    private DoctorDto doctorDto;
    private VetClinicDto vetClinicDto;

    public AppointmentDto() {}

    public AppointmentDto(Long id,
                          LocalDate startTime,
                          AppointmentState appointmentState,
                          ClientDto client,
                          DoctorDto doctorDto,
                          VetClinicDto vetClinicDto) {
        this.id = id;
        this.startTime = startTime;
        this.appointmentState = appointmentState;
        this.client = client;
        this.doctorDto = doctorDto;
        this.vetClinicDto = vetClinicDto;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public AppointmentState getAppointmentState() {
        return appointmentState;
    }

    public ClientDto getClient() {
        return client;
    }

    public DoctorDto getDoctorDto() {
        return doctorDto;
    }

    public VetClinicDto getVetClinicDto() {
        return vetClinicDto;
    }
}
