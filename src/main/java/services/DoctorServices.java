package services;

import data.models.User;

public interface DoctorServices {
    User register(String username, String password);

}
