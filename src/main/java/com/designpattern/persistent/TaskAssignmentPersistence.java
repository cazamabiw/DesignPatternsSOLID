package com.designpattern.persistent;

import com.designpattern.controller.TaskAssignment;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public interface TaskAssignmentPersistence {
    void saveTaskAssignment(TaskAssignment taskAssignment);
    void updateTaskAssignment(TaskAssignment taskAssignment);
    void removeTaskAssignment(TaskAssignment taskAssignment);
    List<TaskAssignment> getAllTaskAssignments();
}
