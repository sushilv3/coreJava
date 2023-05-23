package org.example.mapper;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private List<OrganisationDetails> organisationDetails;
    private List<EmpAddress> address;
    private String name;
    private String salary;

    public Employee() {
    }

    public Employee(List<OrganisationDetails> organisationDetails, List<EmpAddress> address, String name, String salary) {
        this.organisationDetails = organisationDetails;
        this.address = address;
        this.name = name;
        this.salary = salary;
    }

    public Employee getEmployees() {
        List<OrganisationDetails> organisationDetails = Arrays.asList(new OrganisationDetails("1", Arrays.asList("Lucknow", "Kanpur"), "Up"));
        List<EmpAddress> empAddresses = Arrays.asList(new EmpAddress("226012", "MG School"), new EmpAddress("282001", "SMS School"));

        Employee employee = new Employee(organisationDetails, empAddresses, "new Emp name", "60000");
        return employee;
    }

    public List<OrganisationDetails> getOrganisationDetails() {
        return organisationDetails;
    }

    public void setOrganisationDetails(List<OrganisationDetails> organisationDetails) {
        this.organisationDetails = organisationDetails;
    }

    public List<EmpAddress> getAddress() {
        return address;
    }

    public void setAddress(List<EmpAddress> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "organisationDetails=" + organisationDetails +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
