package org.example;

import java.util.Arrays;
import java.util.List;

public class  Customer {

    private String name;
    private String id;
    private List<String> emailId;

    public Customer(String id, String name, List<String> emailId) {
        this.name = name;
        this.id = id;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getEmailId() {
        return emailId;
    }

    public void setEmailId(List<String> emailId) {
        this.emailId = emailId;
    }

    public static List<Customer> getAllCustomer() {
       return Arrays.asList(new Customer("1", "Mohan", Arrays.asList("mohan@gmail.com", "mohan1@gmail.com")),
                new Customer("2", "Shyam", Arrays.asList("Shyam@gmail.com", "Shyam1@gmail.com")),
                new Customer("3", "Santosh", Arrays.asList("Santosh@gmail.com", "Santosh1@gmail.com")),
                new Customer("4", "Manoj", Arrays.asList("Manoj@gmail.com", "Manoj1@gmail.com")));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", emailId=" + emailId +
                '}';
    }
}
