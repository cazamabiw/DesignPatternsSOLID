package com.designpattern.mockdata.taskassignment;

import com.designpattern.controller.TaskAssignment;
import com.designpattern.mockdata.task.MockTask;
import com.designpattern.mockdata.user.MockUser;
import com.designpattern.persistent.MSSQLTaskAssignmentPersistence;
import com.designpattern.persistent.MongoDBTaskAssignmentPersistence;
import com.designpattern.persistent.TaskAssignmentPersistence;
import com.designpattern.task.Task;
import com.designpattern.user.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pawinee Mahantamak
 */
public class MockTaskAssignment {

    public static List<TaskAssignment> TaskAssignmentData() {
        TaskAssignmentPersistence mongoDBPersistence = new MongoDBTaskAssignmentPersistence();
        TaskAssignmentPersistence mssqlPersistence = new MSSQLTaskAssignmentPersistence();
        List<Task> tasks = MockTask.Tasks();
        List<User> users = MockUser.Users();

        List<TaskAssignment> taskAssignments = new ArrayList<>();

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            // mock random user in user list
            Collections.shuffle(users);
            Random random = new Random();
            int numberOfRandomUsers = random.nextInt(6) + 1;

            List<User> randomUsers = users.subList(0, Math.min(numberOfRandomUsers, users.size()));

            // Check if the task index is odd or even and use the corresponding persistence
            TaskAssignmentPersistence persistence = (i % 2 == 0) ? mongoDBPersistence : mssqlPersistence;

            if (i != tasks.size() - 1) {
                taskAssignments.add(TaskAssignmentFactory.createTaskAssignment(task, randomUsers, persistence));
            } else {
                //mock no user assigned
                taskAssignments.add(TaskAssignmentFactory.createTaskAssignment(task, null, persistence));
            }

        }
        return taskAssignments;
    }
}
