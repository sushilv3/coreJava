package org.example.mapper;

import java.util.List;

public class OrganisationDetails {
    private String orgId;
    private List<String> city;
    private String state;

    public OrganisationDetails(String orgId, List<String> city, String state) {
        this.orgId = orgId;
        this.city = city;
        this.state = state;
    }

    public OrganisationDetails() {
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OrganisationDetails{" +
                "orgId='" + orgId + '\'' +
                ", city=" + city +
                ", state='" + state + '\'' +
                '}';
    }
}
