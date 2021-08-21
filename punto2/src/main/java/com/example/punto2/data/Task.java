package com.example.punto2.data;

import com.example.punto2.dto.TaskDto;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class Task {
    private String id;
    private String name;
    private String description;
    private TaskEnum status;
    private String assignedTo;
    private SimpleDateFormat dueDate;
    private SimpleDateFormat created;
    public Task(TaskDto taskDto){
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
        name = taskDto.name;
        description = taskDto.description;
        assignedTo = taskDto.assignedTo;
        dueDate = new SimpleDateFormat(taskDto.created);
        created = new SimpleDateFormat(taskDto.dueDate);
        status = taskDto.status;



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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskEnum getStatus() {
        return status;
    }

    public void setStatus(TaskEnum status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public SimpleDateFormat getDueDate() {
        return dueDate;
    }

    public void setDueDate(SimpleDateFormat dueDate) {
        this.dueDate = dueDate;
    }

    public SimpleDateFormat getCreated() {
        return created;
    }

    public void setCreated(SimpleDateFormat created) {
        this.created = created;
    }
}
