package org.Medical;

import java.util.Date;

public class Patient extends User {
    private String patientId;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
    private String ailment;

    public Patient(String fullName, String password, String userId, String userType, String patientId, Date dateOfBirth,
                   String email, String phoneNumber, String ailment) {
        super(fullName, password, userId, userType);
        this.fullName = fullName;
    }

}