package com.vibha.vibhaapp.controller;

import com.vibha.vibhaapp.exception.ResourceNotFound;
import com.vibha.vibhaapp.model.Task;
import com.vibha.vibhaapp.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping
    public List<Task> getAllTask() {
        return taskRepo.findAll();
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task) {


        return taskRepo.save(task);
    }
    @GetMapping("{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id){
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Task id does not exist: " + id));

        return ResponseEntity.ok(task);
    }
    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(@PathVariable long id,@RequestBody Task TaskDetails) {


        Task updateTask = taskRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Task id does not exist" + id));
        updateTask.setTitle(TaskDetails.getTitle());
        updateTask.setDescription(TaskDetails.getDescription());
        updateTask.setStatus(TaskDetails.getStatus());
        updateTask.setCreatedAt(TaskDetails.getCreatedAt());
        updateTask.setUpdatedAt(TaskDetails.getUpdatedAt());
        taskRepo.save(updateTask);
        return ResponseEntity.ok(updateTask);

    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable long id){
        Task task=taskRepo.findById(id)
                .orElseThrow(()->new ResourceNotFound("Task id does not exist"+ id));
        taskRepo.delete(task);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}