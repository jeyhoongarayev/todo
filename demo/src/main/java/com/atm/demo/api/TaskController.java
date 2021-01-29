package com.atm.demo.api;

import com.atm.demo.db.entity.Task;
import com.atm.demo.services.TaskServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/task")
public class TaskController {

    private final TaskServices taskServices;

    @GetMapping("/{idOrg}")
    public List<Task> get(@PathVariable int idOrg){
        return taskServices.getAll(idOrg);
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        return taskServices.create(task);
    }

    @PutMapping
    public Task update(@RequestBody Task task){
        return taskServices.update(task);
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable("task") int idTask){
        return taskServices.get(idTask);
    }
}
