package com.designpattern.controller;

import com.designpattern.mockdata.taskassignment.MockTaskAssignment;
import java.io.IOException;

/**
 *
 * @author Pawinee Mahantamak
 */
public class Main {

    public static void main(String[] args) throws IOException {

        TaskDisplayManager.displayTaskDetailsAndAssignedUsers(MockTaskAssignment.TaskAssignmentData());

    }

}
