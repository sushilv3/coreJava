package org.example.clone;

public class Person {
    private String id;
    private String name;
    private Address address;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /*public Person(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }*/

    public Person() {
    }

    public Person(Person p){
        this.id = p.id;
        this.name = p.name;
        this.address = new Address(p.getAddress());
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
