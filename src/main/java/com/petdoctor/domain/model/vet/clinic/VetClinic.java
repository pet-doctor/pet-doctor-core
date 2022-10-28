package com.petdoctor.domain.model.vet.clinic;

import com.petdoctor.domain.model.appointment.AppointmentInfo;
import com.petdoctor.domain.model.client.ClientInfo;
import com.petdoctor.domain.model.client.ClientInterface;
import com.petdoctor.domain.model.doctor.DoctorInfo;
import com.petdoctor.domain.model.doctor.DoctorInterface;

import java.util.Map;

public class VetClinic implements VetClinicInterface {

    private Long id;
    private String address;
    private String email;
    private Map<Long, DoctorInterface> doctors;
    private Map<Long, ClientInterface> clients;

    public VetClinic() {
    }

    public VetClinic(Long id, String address, String email, Map<Long, DoctorInterface> doctors, Map<Long, ClientInterface> clients) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.doctors = doctors;
        this.clients = clients;
    }

    @Override
    public AppointmentInfo closeAppointment(AppointmentInfo appointmentInfo) {

        if (appointmentInfo == null) {
            throw new RuntimeException("AppointmentInfo is null!");
        }

        if (!(appointmentInfo.getDoctor() instanceof DoctorInterface)) {
            throw new RuntimeException("Incorrect type of AppointmentInfo was taken");
        }

        DoctorInterface doctor = doctors.get(appointmentInfo.getDoctor().getId());

        if (doctor == null) {
            throw new RuntimeException("Related doctor isn't exist");
        }

        AppointmentInfo appointmentInfoResult = doctor.closeAppointment(appointmentInfo);
        return appointmentInfoResult;
    }

    @Override
    public AppointmentInfo bookAppointment(AppointmentInfo appointmentInfo) {

        if (appointmentInfo == null) {
            throw new RuntimeException("AppointmentInfo is null!");
        }

        if (!(appointmentInfo.getDoctor() instanceof DoctorInterface)) {
            throw new RuntimeException("Incorrect type of AppointmentInfo was taken");
        }

        DoctorInterface doctor = doctors.get(appointmentInfo.getDoctor().getId());

        if (doctor == null) {
            throw new RuntimeException("Related doctor isn't exist");
        }

        AppointmentInfo appointmentInfoResult = doctor.bookAppointment(appointmentInfo);
        return appointmentInfoResult;
    }

    @Override
    public AppointmentInfo addAppointment(AppointmentInfo appointmentInfo) {

        if (appointmentInfo == null) {
            throw new RuntimeException("AppointmentInfo is null!");
        }

        if (!(appointmentInfo.getDoctor() instanceof DoctorInterface)) {
            throw new RuntimeException("Incorrect type of AppointmentInfo was taken");
        }

        DoctorInterface doctor = doctors.get(appointmentInfo.getDoctor().getId());

        if (doctor == null) {
            throw new RuntimeException("Related doctor isn't exist");
        }

        AppointmentInfo appointmentInfoResult = doctor.addAppointment(appointmentInfo);
        return appointmentInfoResult;
    }

    @Override
    public void deleteAppointment(AppointmentInfo appointmentInfo) {

        if (appointmentInfo == null) {
            throw new RuntimeException("AppointmentInfo is null!");
        }

        if (!(appointmentInfo.getDoctor() instanceof DoctorInterface)) {
            throw new RuntimeException("Incorrect type of AppointmentInfo was taken");
        }

        DoctorInterface doctor = doctors.get(appointmentInfo.getDoctor().getId());

        if (doctor == null) {
            throw new RuntimeException("Related doctor isn't exist");
        }

        doctor.deleteAppointment(appointmentInfo);
    }

    @Override
    public DoctorInfo addDoctor(DoctorInfo doctor) {

        if (doctor == null) {
            throw new RuntimeException("Doctor is null! :(");
        }

        if (!(doctor instanceof DoctorInterface doctorInterface)) {
            throw new RuntimeException("Incorrect type of Doctor was taken");
        }

        if (doctors.containsKey(doctorInterface.getId())) {
            throw new RuntimeException("Doctor has already added");
        }

        doctors.put(doctorInterface.getId(), doctorInterface);
        return doctorInterface;
    }

    @Override
    public ClientInfo addClient(ClientInfo client) {

        if (client == null) {
            throw new RuntimeException("Client is null! :(");
        }

        if (!(client instanceof ClientInterface clientInterface)) {
            throw new RuntimeException("Incorrect type of Client was taken");
        }

        if (clients.containsKey(clientInterface.getId())) {
            throw new RuntimeException("Client has already added");
        }

        clients.put(clientInterface.getId(), clientInterface);
        return clientInterface;
    }
}
