package com.designpattern.task;

/**
 *
 * @author Pawinee Mahantamak
 */
public class CodingTask extends Task {

    private String functionName;

    public CodingTask() {

    }

    public CodingTask(String title, String description, String priority, String functionName) {
        super(title, description, priority);
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override
    public void performTask() {
        System.out.println("Performing code task: " + this.getTitle());
        System.out.println("=======================================");
        System.out.println("Description: " + this.getDescription());
        System.out.println("Priority: " + this.getPriority());
        System.out.println("Function Name: " + this.getFunctionName());
        System.out.println("Status: " + (this.isCompleted() ? "Complete" : "Incomplete"));
        System.out.println("---------------------------------------");
    }
}
