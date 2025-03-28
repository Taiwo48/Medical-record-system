package org.Medical;

import java.util.Date;

public class Patient extends User {
    private String patientId;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
    private String ailment;

    public Patient(String fullName, String password, String userId, String userType,
                   String patientId, Date dateOfBirth, String email, String phoneNumber, String ailment) {
        super(fullName, password, userId, userType);
        this.patientId = patientId;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ailment = ailment;
    }

    public void bookAppointment() {
        System.out.println(super.getFullName() + " booked an appointment.");
    }

    public void viewMedicalRecords() {
        System.out.println("Viewing medical records for " + super.getFullName());
    }

    public void viewPrescription() {
        System.out.println("Viewing prescriptions for " + super.getFullName());
    }

    public void cancelAppointment() {
        System.out.println(super.getFullName() + " canceled an appointment.");
    }

    public void manageAccount() {
        System.out.println("Managing account for " + super.getFullName());
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
}
