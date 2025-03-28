package data.models;

public class Patient extends User{

//    private int patientId;
    public String dateOfBirth;
    public String gender;
    public String phoneNumber;
//    public String ailment;


    public Patient(String fullName, String email, String userName, String password, String dateOfBirth, String gender, String phoneNumber) {
        super(fullName, email, userName, password);
//        this.patientId = patientId;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
//        this.ailment = ailment;

    }
//    private String generateInstructorId() {
//        return "INS" + (instructors.size() + 100000);
//    }


//    public void setPatientId(int patientId) {
//        this.patientId = patientId;
//    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}


