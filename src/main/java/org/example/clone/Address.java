package org.example.clone;

public class Address {
    private String state;
    private String city;

    public Address(String city, String state) {
        this.state = state;
        this.city = city;
    }

    public Address(Address address) {
        this.city = address.city;
        this.state = address.state;
    }

    public Address() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
