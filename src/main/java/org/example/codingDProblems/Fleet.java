package org.example.codingDProblems;

public class Fleet {

    private String dId;
    private String fleetName;

    public Fleet(String dId, String fleetName) {
        this.dId = dId;
        this.fleetName = fleetName;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getFleetName() {
        return fleetName;
    }

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    @Override
    public String toString() {
        return "Fleet{" +
                "dId='" + dId + '\'' +
                ", fleetName='" + fleetName + '\'' +
                '}';
    }
}
