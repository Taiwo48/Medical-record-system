package data.repositories;

import data.models.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorRepositoryTest {
    public DoctorRepository doctorRepository = new Doctors();

    @Test
    public void saveDoctor_countIsOneTest() {
        Doctor doctor = new Doctor();
        assertEquals(0, doctorRepository.countDoctors());
        doctorRepository.save(doctor);
        assertEquals(1, doctorRepository.countDoctors());
    }
}