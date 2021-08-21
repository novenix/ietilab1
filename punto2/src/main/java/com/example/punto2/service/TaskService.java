package com.example.punto2.service;

import com.example.punto2.data.Task;

import java.util.HashMap;

public interface TaskService
{
    Task create(Task task );

    Task findById( String id );

    HashMap<String,Task> all();

    Boolean deleteById( String id );

    Task update( Task task, String id );
}