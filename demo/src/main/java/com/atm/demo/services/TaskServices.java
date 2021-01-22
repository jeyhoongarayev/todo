package com.atm.demo.services;

import com.atm.demo.db.entity.Task;

import java.util.List;

public interface TaskServices {

    Task get(int idTask);

    Task create(Task task);

    Task update(Task task);

    List<Task> getAll(int idOrg);
}
