package com.atm.demo.services.impl;

import com.atm.demo.db.entity.Task;
import com.atm.demo.db.repository.TaskRepository;
import com.atm.demo.services.TaskServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServicesImpl implements TaskServices {

    private final TaskRepository taskRepository;

    @Override
    public Task get(int idTask) {
        return taskRepository.findById(idTask).get();
    }

    @Override
    public Task create(Task task) {
        task = taskRepository.save(task);
        return null;
    }

    @Override
    public Task update(Task task) {
        task = taskRepository.save(task);
        return null;
    }

    @Override
    public List<Task> getAll(int idOrg) {
        return taskRepository.findByIdOrg(idOrg);
    }
}
