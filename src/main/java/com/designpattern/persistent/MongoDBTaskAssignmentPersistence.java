package com.designpattern.persistent;

import com.designpattern.controller.TaskAssignment;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class MongoDBTaskAssignmentPersistence implements TaskAssignmentPersistence {

    public MongoDBTaskAssignmentPersistence() {
   
    }

    @Override
    public void saveTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to save task assignment to MongoDB
        System.out.println("Save data to MongoDB: Task " + taskAssignment.getTask().getTitle());
    }

    @Override
    public void updateTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to update task assignment in MongoDB
    }

    @Override
    public void removeTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to remove task assignment from MongoDB
    }

    @Override
    public List<TaskAssignment> getAllTaskAssignments() {
        // Logic to get task assignment from MongoDB
       return null;
    }

}
