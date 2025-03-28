package data.repositories;

import data.models.Doctor;
import data.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorRepositoryTest {
    public DoctorRepository doctorRepository = new Doctors();

    @Test
    public void saveDoctor_countIsOneTest() {
        Doctor doctor = new Doctor("Onyii", "onyii@gmail.com", "oe", "123", "internal medicine", "cardiology");
        assertEquals(0, doctorRepository.countDoctors());
        doctorRepository.save(doctor);
        assertEquals(1, doctorRepository.countDoctors());
    }

    @Test
    public void saveTwoDoctors_countIsTwoTest() {
        Doctor doctor1 = new Doctor("Tosin","Tosin@gmail.com", "Tot", "123", "internal medicine", "cardiology");
        Doctor doctor2 = new Doctor("Taiwo", "Taiwo@gmail.com", "Taiwo.A", "123", "internal medicine", "cardiology");
        assertEquals(0, doctorRepository.countDoctors());
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        assertEquals(2, doctorRepository.countDoctors());
    }

    @Test
    public void saveDoctor_FindOneDoctorByIdTest() {
        Doctor doctor1 = new Doctor("Autumn", "Au@gmail.com", "Autumn", "123", "internal medicine", "cardiology");
        Doctor doctor2 = new Doctor("Emmy", "E@gmail.com", "Emmy1", "123", "internal medicine", "cardiology");
        assertEquals(0, doctorRepository.countDoctors());
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        assertEquals(2, doctorRepository.countDoctors());
        Doctor doctor = doctorRepository.findDoctorById("Doctor1");
        assertEquals("Autumn", doctor.getFullName());
    }

    @Test
    public void saveDoctor_FindAllDoctorsTest() {

    }
}