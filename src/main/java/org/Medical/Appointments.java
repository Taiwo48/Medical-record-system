package org.Medical;

import java.util.Date;

public class Appointments {
    private Date appointmentDate;
    private String patientId;
    private String appointmentId;
    private String doctorId;

    public Appointments(Date appointmentDate, String patientId, String appointmentId, String doctorId) {
        this.appointmentDate = appointmentDate;
        this.patientId = patientId;
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
    }
}
