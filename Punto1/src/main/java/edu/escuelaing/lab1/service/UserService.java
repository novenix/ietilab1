package edu.escuelaing.lab1.service;

import edu.escuelaing.lab1.data.User;

import java.util.HashMap;

public interface UserService  {
    User create(User user );

    User findById( String id );

    HashMap<String,User> all();

    Boolean deleteById(String id );

    User update( User user, String userId );
}
