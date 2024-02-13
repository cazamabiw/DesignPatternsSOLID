package com.designpattern.controller;

import com.designpattern.task.Task;
import com.designpattern.user.User;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class TaskDisplayManager {

 public static void displayTaskDetailsAndAssignedUsers(List<TaskAssignment> taskAssignments) {
        TaskManager taskManager = TaskManager.Instance();
        List<Task> tasks = taskManager.getTasks();

        tasks.forEach(task -> {
            task.performTask();
            displayAssignedUsers(task, taskAssignments);
            System.out.println();
        });
    }

    private static void displayAssignedUsers(Task task, List<TaskAssignment> taskAssignments) {
        TaskAssignment taskAssignment = TaskAssignment.getTaskAssignment(taskAssignments, task);
        if (taskAssignment != null) {
            List<User> assignedUsers = taskAssignment.getAssignedUsers();
            if (assignedUsers != null) {
                System.out.println("Assigned Users:");
                assignedUsers.forEach(user -> System.out.println("- " + user.getUsername()));
            } else {
                System.out.println("No users assigned to this task.");
            }
        } else {
            System.out.println("No assignments found for this task.");
        }
    }
}
