package com.designpattern.mockdata.task;

import com.designpattern.task.Task;

/**
 *
 * @author Pawinee Mahantamak
 */
public interface TaskAbstractFactory {
    Task createTask(String title, String description, String priority, Object... args);
}