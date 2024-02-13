package com.designpattern.task;

import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class BugFixingTask extends Task {

    private List<String> affectedModules;

    public BugFixingTask(String title, String description, String priority, List<String> affectedModules) {
        super(title, description, priority);
        this.affectedModules = affectedModules;
    }

    public List<String> getAffectedModules() {
        return affectedModules;
    }

    @Override
    public void performTask() {
        System.out.println("Performing bug fixing task: " + this.getTitle());
        System.out.println("=======================================");
        System.out.println("Description: " + this.getDescription());
        System.out.println("Priority: " + this.getPriority());
        System.out.println("Affected Modules:");
        for (String module : this.getAffectedModules()) {
            System.out.println("- " + module);
        }
        System.out.println("Status: " + (this.isCompleted() ? "Complete" : "Incomplete"));
        System.out.println("---------------------------------------");
    }
}
