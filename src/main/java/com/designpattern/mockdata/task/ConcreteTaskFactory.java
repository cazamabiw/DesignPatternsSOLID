package com.designpattern.mockdata.task;

import com.designpattern.task.BugFixingTask;
import com.designpattern.task.CodeReviewTask;
import com.designpattern.task.CodingTask;
import com.designpattern.task.Task;
import com.designpattern.task.TestingTask;
import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class ConcreteTaskFactory implements TaskAbstractFactory{
      @Override
    public Task createTask(String title, String description, String priority, Object... args) {
        String type = (String) args[0];
        switch (type) {
            case "BugFixing":
                List<String> affectedModules = (List<String>) args[1];
                return new BugFixingTask(title, description, priority, affectedModules);
            case "CodeReview":
                OffsetDateTime reviewDeadline = (OffsetDateTime) args[1];
                List<String> codeReviewChecklist = (List<String>) args[2];
                return new CodeReviewTask(title, description, priority, reviewDeadline, codeReviewChecklist);
            case "Coding":
                String functionName = (String) args[1];
                return new CodingTask(title, description, priority, functionName);
            case "Testing":
                List<String> testCases = (List<String>) args[1];
                String testingEnvironment = (String) args[2];
                String expectedOutcome = (String) args[3];
                return new TestingTask(title, description, priority, testCases, testingEnvironment, expectedOutcome);
            default:
                throw new IllegalArgumentException("Invalid task type: " + type);
        }
    }
}
