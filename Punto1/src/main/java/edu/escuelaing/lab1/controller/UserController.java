package edu.escuelaing.lab1.controller;

import edu.escuelaing.lab1.data.User;
import edu.escuelaing.lab1.dto.UserDto;
import edu.escuelaing.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    public UserController( @Autowired UserService userService )
    {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<HashMap<String,User>> all()
    {
        HashMap<String,User> response= userService.all();
        return new ResponseEntity<>(
            response, HttpStatus.OK
    ) ;
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id )
    {
        //TODO implement this method using UserService
        User response = userService.findById(id);
        return  new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
    {
        User response= userService.create(new User(userDto));


        return  new ResponseEntity<>(
              response, HttpStatus.OK
        ) ;
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        //TODO implement this method using UserService
        User response= userService.update(new User(userDto),id);
        return   new ResponseEntity<>(
            response, HttpStatus.OK
    ) ;
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        Boolean response= userService.deleteById(id);
        //TODO implement this method using UserService
        return new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }
}