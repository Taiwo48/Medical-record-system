package data.models;

public class Doctor extends User{
    public String department;
    public String speciality;
    public String doctorId;


    public Doctor(String fullName, String email, String userName, String password, String department, String speciality) {
        super(fullName, email, userName, password);
        this.doctorId = doctorId;
        this.department = department;
        this.speciality = speciality;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

}
