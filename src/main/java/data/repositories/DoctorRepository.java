package data.repositories;

import data.models.Doctor;

import java.util.List;

public interface DoctorRepository {
     Doctor save(Doctor doctor);
     long countDoctors();
     Doctor findDoctorById(String id);
     List<Doctor> findDoctors();
     boolean existsByUsername(String username);
     void viewPatientsAssigned();
     void diagnose();



}
