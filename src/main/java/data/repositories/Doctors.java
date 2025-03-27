package data.repositories;

import data.models.Doctor;

import java.util.ArrayList;
import java.util.List;

public class Doctors implements DoctorRepository {

    private final List<Doctor> doctorList = new ArrayList<>();

    @Override
    public Doctor save(Doctor doctor) {
        if (isNew(doctor)) {
            doctorList.add(doctor);
        } else {
            updateDoctor(doctor);
        }
        return doctor;

    }

    private void updateDoctor(Doctor doctor) {
        for (int index = 0; index < doctorList.size(); index++) {
            if (doctorList.get(index).doctorId == doctor.doctorId) {
                doctorList.set(index, doctor);
                break;
            }
        }
    }

    private boolean isNew(Doctor doctor) {
        for (Doctor newDoctor : doctorList) {
            if (newDoctor.doctorId == doctor.doctorId) {
                return false;
            }
        }
        return true;

    }

    @Override
    public long countDoctors() {
        return 0;
    }

    @Override
    public void deleteDoctor(Doctor doctor) {

    }

    @Override
    public void deleteDoctorById(long id) {

    }

    @Override
    public Doctor findDoctorById(long id) {
        return null;
    }

    @Override
    public List<Doctor> findDoctors() {
        return List.of();
    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public boolean existsByUsername(String username) {
        return false;
    }

    @Override
    public void viewPatientsAssigned() {

    }

    @Override
    public void diagnose() {

    }
}
