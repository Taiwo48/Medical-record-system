package org.Medical;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    private Patient patient;

    @BeforeEach
    void setUp() {
        patient = new Patient("Adebayo Taiwo", "password123", "U123", "Patient",
                "A001", new Date(), "adebayo@gmail.com", "1234567890", "Flu");
    }

    @Test
    void testPatientCreation() {
        assertEquals("Adebayo Taiwo", patient.getFullName());
        assertEquals("P001", patient.getPatientId());
        assertEquals("adebayo@gmail.com", patient.getEmail());
        assertEquals("Flu", patient.getAilment());
    }


    @Test
    void testBookAppointment() {
        assertDoesNotThrow(() -> patient.bookAppointment());
    }

    @Test
    void testViewMedicalRecords() {
        assertDoesNotThrow(() -> patient.viewMedicalRecords());
    }

    @Test
    void testViewPrescription() {
        assertDoesNotThrow(() -> patient.viewPrescription());
    }

    @Test
    void testCancelAppointment() {
        assertDoesNotThrow(() -> patient.cancelAppointment());
    }

    @Test
    void testManageAccount() {
        assertDoesNotThrow(() -> patient.manageAccount());
    }

    @Test
    void testSetAndGetPatientId() {
        patient.setPatientId("A002");
        assertEquals("A002", patient.getPatientId());
    }

    @Test
    void testSetAndGetEmail() {
        patient.setEmail("adebayo@gmail.com");
        assertEquals("adebayo@gmail.com", patient.getEmail());
    }

    @Test
    void testSetAndGetPhoneNumber() {
        patient.setPhoneNumber("0986765445");
        assertEquals("0986765445", patient.getPhoneNumber());
    }
}
