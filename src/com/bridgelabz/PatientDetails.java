package com.bridgelabz;

import java.util.Scanner;

public class PatientDetails {
    String patientfirstName;
    String patientlastName;
    long patientPhoneNumber;
    String patientCity;
    String patientState;
    String patientzipcode;

    Scanner sc = new Scanner(System.in);


    public String getpatientfirstName() {
        return patientfirstName;
    }

    public void setPatientfirstName(String patientfirstName) {
        this.patientfirstName = patientfirstName;
    }

    public String getpatientlastName() {
        return patientlastName;
    }

    public void setPatientlastName(String patientlastName) {
        this.patientlastName = patientlastName;
    }

    public long getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(long patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public String getpatientzipcode() {
        return patientzipcode;
    }

    public void setPatientzipcode(String zipcode) {
        this.patientzipcode = zipcode;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "patientfirstName='" + patientfirstName + '\'' +
                ", patientlastName=" + patientlastName +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", patientCity='" + patientCity + '\'' +
                ", patientState='" + patientState + '\'' +
                ", patientzipcode=" + patientzipcode + '\'' +
                '}';
    }
}
