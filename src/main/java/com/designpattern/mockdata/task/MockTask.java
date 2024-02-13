package com.designpattern.mockdata.task;

import com.designpattern.controller.TaskManager;
import com.designpattern.task.Priority;
import com.designpattern.task.Task;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class MockTask {

    public static List<Task> Tasks() {
        TaskAbstractFactory factory = new ConcreteTaskFactory();
        OffsetDateTime currentUtcTime = OffsetDateTime.now(ZoneOffset.UTC).plusDays(7);

        Task codeReviewTask = factory.createTask("Code review task", "Review a geofence function", Priority.MEDIUM, "CodeReview", currentUtcTime, List.of("Check for proper variable naming", "Verify boundary cases", "Ensure adherence to coding standards"));
        Task codingTask = factory.createTask("Implement geofence functionality", "Implement functionality to track vehicles within specified geographic areas", Priority.HIGH, "Coding", "trackVehiclesInGeofence");
        Task bugFixingTask = factory.createTask("Fix issue with vehicle position updates", "Fix bug causing incorrect position updates for vehicles", Priority.HIGH, "BugFixing", List.of("Vehicle Tracking", "Geofence Management"));
        Task testingTask = factory.createTask(
                "Test vehicle tracking functionality",
                "Perform comprehensive testing of the new vehicle tracking functionality to ensure its accuracy and reliability under various conditions.",
                Priority.HIGH,
                "Testing",
                List.of(
                        "Verify real-time updating of vehicle locations",
                        "Test accuracy in different terrains and weather conditions"
                ), // Subtasks
                "Field Testing Environment",
                "Verify that vehicles' positions are accurately tracked and updated in real-time to support efficient monitoring and management operations."
        );
        Task testingTask2 = factory.createTask("Test geofence functionality", "Test new geofence functionality and ensure correct behavior", Priority.LOW, "Testing", List.of("Verify vehicle location updates within geofence", "Test boundary conditions of geofence", "Ensure correct handling of invalid inputs"), "Simulation Environment", "Vehicles are correctly tracked within specified geographic areas");

        TaskManager taskManager = TaskManager.Instance();

        taskManager.addTask(codeReviewTask);
        taskManager.addTask(codingTask);
        taskManager.addTask(bugFixingTask);
        taskManager.addTask(testingTask);
        taskManager.addTask(testingTask2);
        return taskManager.getTasks();
    }

}
