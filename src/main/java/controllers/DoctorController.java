package controllers;

import data.models.User;
import services.DoctorServices;


public class DoctorController {
    final private DoctorServices doctorService;

    public DoctorController(DoctorServices doctorService) {
        this.doctorService = doctorService;
    }


    public User register(String username, String password){
        return doctorService.register(username, password);
    }

}
