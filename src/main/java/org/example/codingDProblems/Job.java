package org.example.codingDProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job {
    private String jobNumber;
    private Fleet fleetName;

    public Job(String jobNumber, Fleet fleetName) {
        this.jobNumber = jobNumber;
        this.fleetName = fleetName;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Fleet getFleetName() {
        return fleetName;
    }

    public void setFleetName(Fleet fleetName) {
        this.fleetName = fleetName;
    }

    public static List<Job> getAllJobs(List<String> disList) {
        List<Job> allJobs = Arrays.asList(new Job("1", new Fleet("d1", "fName1")),
                new Job("2", new Fleet("d2", "fName2")),
                new Job("3", new Fleet("d3", "fName3")),
                new Job("4", new Fleet("d4", "fName4")));
        List<Job> filteredJobs = new ArrayList<>();
        if(!disList.isEmpty() && disList.size()!=0) {
            for (String d : disList) {
                allJobs.forEach(j -> {
                    Fleet fleet = j.getFleetName();
                    if (fleet.getdId().equals(d)) {
                        filteredJobs.add(j);
                    }
                });
            }
        }
        return filteredJobs;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobNumber='" + jobNumber + '\'' +
                ", fleetName=" + fleetName +
                '}';
    }
}
