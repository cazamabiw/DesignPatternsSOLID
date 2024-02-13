package com.designpattern.controller;

import com.designpattern.task.Task;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class TaskManager {

    private static TaskManager instance;
    private List<Task> tasks;

    private TaskManager() {
        tasks = new ArrayList<>();
    }

    public static TaskManager Instance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
