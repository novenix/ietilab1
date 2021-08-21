package com.example.punto2.service;

import com.example.punto2.data.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class TaskServiceHashMap implements TaskService {
    private HashMap<String, Task> taskRepository=new HashMap<>();

    @Override
    public Task create(Task task) {

        taskRepository.put(task.getId(),task);
        return task;
    }

    @Override
    public Task findById(String id) {

        return taskRepository.get(id);
    }

    @Override
    public HashMap<String,Task> all() {
        return taskRepository;
    }

    @Override
    public Boolean deleteById(String id) {
        taskRepository.remove(id);
        return true;
    }

    @Override
    public Task update(Task task, String userId) {
        task.setId(userId);
        taskRepository.put(task.getId(),task);
        return task;
    }
}

