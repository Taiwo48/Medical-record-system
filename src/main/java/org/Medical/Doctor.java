package org.Medical;
import java.util.List;

public class Doctor extends User {
    private String doctorId;
    private boolean setAvailability;
    private String specialization;
    private List<Patient> patientsAssigned;
    private String department;

    public Doctor(String fullName, String password, String userId, String userType, String doctorId,
                  boolean setAvailability, String specialization, String department) {
        super(fullName, password, userId, userType);
    }
}