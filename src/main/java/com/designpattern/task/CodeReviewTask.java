package com.designpattern.task;

import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class CodeReviewTask extends Task {

    private List<String> codeReviewChecklist;
    private OffsetDateTime reviewDeadline;

    public CodeReviewTask(String title, String description, String priority, OffsetDateTime reviewDeadline, List<String> codeReviewChecklist) {
        super(title, description, priority);
        this.codeReviewChecklist = codeReviewChecklist;
        this.reviewDeadline = reviewDeadline;
    }

    public List<String> getCodeReviewChecklist() {
        return codeReviewChecklist;
    }

    public OffsetDateTime getReviewDeadline() {
        return reviewDeadline;
    }

    @Override
    public void performTask() {

        System.out.println("Performing code review task: " + this.getTitle());
        System.out.println("=======================================");
        System.out.println("Description: " + this.getDescription());
        System.out.println("Priority: " + this.getPriority());
        System.out.println("Review Deadline: " + this.getReviewDeadline());
        System.out.println("Code Review Checklist:");
        for (String item : this.getCodeReviewChecklist()) {
            System.out.println("- " + item);
        }
        System.out.println("Status: " + (this.isCompleted() ? "Complete" : "Incomplete"));
        System.out.println("---------------------------------------");

    }
}
