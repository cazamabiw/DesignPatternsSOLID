package com.designpattern.persistent;

import com.designpattern.controller.TaskAssignment;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class MSSQLTaskAssignmentPersistence implements TaskAssignmentPersistence {

    @Override
    public void saveTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to add task assignment from MSSQL   
        System.out.println("Save data to MSSQL: Task " + taskAssignment.getTask().getTitle());
    }

    @Override
    public void removeTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to remove task assignment from MSSQL   
    }

    @Override
    public List<TaskAssignment> getAllTaskAssignments() {
        // Logic to get task assignment from MSSQL  
        return null;
    }

    @Override
    public void updateTaskAssignment(TaskAssignment taskAssignment) {
        // Logic to update task assignment from MSSQL     
    }

}
