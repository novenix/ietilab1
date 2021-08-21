package com.example.punto2.controller;

import com.example.punto2.data.Task;
import com.example.punto2.dto.TaskDto;
import com.example.punto2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping( "/v1/task" )
public class TaskController {
    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<HashMap<String, Task>> all()
    {
        HashMap<String,Task> response= taskService.all();
        return new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById( @PathVariable String id )
    {
        //TODO implement this method using UserService
        Task response = taskService.findById(id);
        return  new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }


    @PostMapping
    public ResponseEntity<Task> create( @RequestBody TaskDto taskDto )
    {
        Task response= taskService.create(new Task(taskDto));


        return  new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id )
    {
        //TODO implement this method using UserService
        Task response= taskService.update(new Task(taskDto),id);
        return   new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        Boolean response= taskService.deleteById(id);
        //TODO implement this method using UserService
        return new ResponseEntity<>(
                response, HttpStatus.OK
        ) ;
    }
}
