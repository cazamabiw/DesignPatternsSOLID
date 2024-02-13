package com.designpattern.mockdata.taskassignment;

import com.designpattern.controller.TaskAssignment;
import com.designpattern.persistent.TaskAssignmentPersistence;
import com.designpattern.task.Task;
import com.designpattern.user.User;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class TaskAssignmentFactory {
        public static TaskAssignment createTaskAssignment(Task task, List<User> assignedUsers, TaskAssignmentPersistence persistence) {
        TaskAssignment taskAssignment = new TaskAssignment(task, assignedUsers,persistence);
        taskAssignment.saveTaskAssignment();
        return taskAssignment;
    }
}
