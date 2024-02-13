package com.designpattern.task;

import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class TestingTask extends Task {

    private List<String> testCases;
    private String testingEnvironment;
    private String expectedOutcome;

    public TestingTask(String title, String description, String priority, List<String> testCases, String testingEnvironment, String expectedOutcome) {
        super(title, description, priority);
        this.expectedOutcome = expectedOutcome;
        this.testCases = testCases;
        this.testingEnvironment = testingEnvironment;
    }

    @Override
    public void performTask() {
        System.out.println("Performing testing task: " + this.getTitle());
        System.out.println("=======================================");
        System.out.println("Description: " + this.getDescription());
        System.out.println("Priority: " + this.getPriority());
        System.out.println("Testing Environment: " + this.testingEnvironment);
        System.out.println("Expected Outcome: " + this.expectedOutcome);
        System.out.println("Test Cases:");
        for (String testCase : this.testCases) {
            System.out.println("- " + testCase);
        }
        System.out.println("Status: " + (this.isCompleted() ? "Complete" : "Incomplete"));
        System.out.println("--------------------------------------");
    }
}
