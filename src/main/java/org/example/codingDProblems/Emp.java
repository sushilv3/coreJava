package org.example.codingDProblems;

import java.util.Arrays;
import java.util.List;

public class Emp {
    private String id;
    private String name;

    public Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Emp> getEmpls() {
        return Arrays.asList(new Emp("1", "sushil"),
                new Emp("2", "sushil"),
                new Emp("3", "manish"),
                new Emp("4", "rajat"),
                new Emp("5", "sunny"),
                new Emp("6", "manish"));
    }



    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
