package data.repositories;

import data.models.Doctor;
import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class Doctors implements DoctorRepository {

    private final List<Doctor> doctorList = new ArrayList<>();
    private int doctorIdCounter = 1;

    @Override
    public Doctor save(Doctor doctor) {
        if (isNew(doctor)) {
            doctor.setDoctorId(generateDoctorId());
            doctorList.add(doctor);
        } else {
            updateDoctor(doctor);
        }
        return doctor;

    }

    private void updateDoctor(Doctor doctor) {
        for (int index = 0; index < doctorList.size(); index++) {
            if (doctorList.get(index).doctorId.equals(doctor.doctorId)) {
                doctorList.set(index, doctor);
                break;
            }
        }
    }

    private boolean isNew(Doctor doctor) {
        for (Doctor newDoctor : doctorList) {
            if (newDoctor.doctorId.equals(doctor.doctorId)) {
                return false;
            }
        }
        return true;

    }

    public String generateDoctorId() {
        String doctorId = "Doctor" + doctorIdCounter;
        doctorIdCounter++;
        return doctorId;
    }

    @Override
    public long countDoctors() {
        return doctorList.size();
    }

    @Override
    public Doctor findDoctorById(String id) {
        for (Doctor doctor : doctorList) {
            if (doctor.getDoctorId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }


    @Override
    public List<Doctor> findDoctors() {
        return doctorList;
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
