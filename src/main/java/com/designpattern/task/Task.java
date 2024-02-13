package com.designpattern.task;

/**
 *
 * @author Pawinee Mahantamak
 */
public abstract class Task {

    private String title;
    private String description;
    private String priority;
    private boolean isCompleted;

    public Task(){
    }
    public Task(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false; // By default, a task is not completed
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }


    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
     public abstract void performTask();
}
