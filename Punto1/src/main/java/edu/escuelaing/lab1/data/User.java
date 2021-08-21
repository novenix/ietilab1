package edu.escuelaing.lab1.data;

import edu.escuelaing.lab1.dto.UserDto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private SimpleDateFormat createdAt;

    public User(UserDto userDto) {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
        name = userDto.name;
        email = userDto.email;
        lastName = userDto.lastName;
        createdAt = new SimpleDateFormat(userDto.createdAt);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SimpleDateFormat getCreated() {
        return createdAt;
    }

    public void setCreated(SimpleDateFormat created) {
        this.createdAt = created;
    }
}
