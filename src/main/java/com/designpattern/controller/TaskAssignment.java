package com.designpattern.controller;

import com.designpattern.persistent.TaskAssignmentPersistence;
import com.designpattern.task.Task;
import com.designpattern.user.User;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class TaskAssignment {

    private Task task;
    private List<User> assignedUsers ;
    private TaskAssignmentPersistence persistence;



    public TaskAssignment(Task task, List<User> assignedUsers, TaskAssignmentPersistence persistence) {
        this.task = task;
        this.assignedUsers = assignedUsers;
        this.persistence = persistence;
    }

    public void assignUser(User user) {
        assignedUsers.add(user);
    }

    public void unassignUser(User user) {
        assignedUsers.remove(user);
    }

    public List<User> getAssignedUsers() {
        return assignedUsers;
    }

    public Task getTask() {
        return task;
    }

    public static TaskAssignment getTaskAssignment(List<TaskAssignment> taskAssignments, Task task) {
        for (TaskAssignment assignment : taskAssignments) {
            if (assignment.getTask().equals(task)) {

                return assignment;
            }
        }
        return null; // Return null if no assignment is found for the given task
    }
    
    // Save task assignment using the injected persistence
    public void saveTaskAssignment() {
        if (persistence != null) {
            persistence.saveTaskAssignment(this);
        } else {
            throw new IllegalStateException("TaskAssignmentPersistence is not set.");
        }
    }
}
