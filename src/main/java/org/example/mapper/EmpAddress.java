package org.example.mapper;

public class EmpAddress {
    private String pinCode;
    private String landMark;

    public EmpAddress(String pinCode, String landMark) {
        this.pinCode = pinCode;
        this.landMark = landMark;
    }

    public EmpAddress() {
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    @Override
    public String toString() {
        return "EmpAddress{" +
                "pinCode='" + pinCode + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}
