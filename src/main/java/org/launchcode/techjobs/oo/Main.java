package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency(""));
        System.out.println(job1.toString());
        System.out.println(job1.getEmployer().getValue());
        System.out.println(job1.getId() + " " + job1.getEmployer().getId());

    }

}