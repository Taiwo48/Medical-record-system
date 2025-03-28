package data.models;

public class Appointment extends User {
    private int appointmentId;
    private int patientId;
    private String appointmentDate;
    private int doctorId;

    public Appointment(String fullName, String email, String userName, String password, int appointmentId, int patientId, String appointmentDate, int doctorId) {
        super(fullName, email, userName, password);
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.patientId = patientId;
    }


    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}


