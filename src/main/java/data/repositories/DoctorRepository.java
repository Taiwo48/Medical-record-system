package data.repositories;

import data.models.Doctor;

import java.util.List;

public interface DoctorRepository {
     Doctor save(Doctor doctor);
     long countDoctors();
     void deleteDoctor(Doctor doctor);
     void deleteDoctorById(long id);
     Doctor findDoctorById(long id);
     List<Doctor> findDoctors();
     boolean existsById(long id);
     boolean existsByUsername(String username);
     void viewPatientsAssigned();
     void diagnose();



}
