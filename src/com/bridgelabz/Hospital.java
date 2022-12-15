package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

    ArrayList<PatientDetails> patientArrayList = new ArrayList<>();
    private HashMap<String, ArrayList<PatientDetails>> hospitalManagementSystem = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    // Method to add Patient
    public void addPatient() {

        Hospital hospital = new Hospital();
        PatientDetails patient = new PatientDetails();

        System.out.println("\nFor adding a new patient enter the following details");

        // Set the value of patient detail
        System.out.println("\nEnter firstName ");
        patient.setPatientfirstName(sc.next());
        System.out.println("Enter lastName ");
        patient.setPatientlastName(sc.next());
        System.out.println("Enter Phone No. ");
        patient.setPatientPhoneNumber(sc.nextLong());
        System.out.println("Enter City ");
        patient.setPatientCity(sc.next());
        System.out.println("Enter State ");
        patient.setPatientState(sc.next());
        System.out.println("Enter zipcode");
        patient.setPatientzipcode(sc.next());


        // Stored the information in patientArrayList
        patientArrayList.add(patient);

        System.out.println("Enter hospital name");
        sc.nextLine();
        String hospitalName = sc.nextLine();


        if(hospitalManagementSystem.containsKey(hospitalName)) {
            ArrayList<PatientDetails> patientList = hospitalManagementSystem.get(hospitalName);
            hospitalManagementSystem.put(hospitalName,patientList);
            System.out.println("Patient added successfully exiting hospital");
        }

        else {
            ArrayList<PatientDetails> patientArrayList1 = hospitalManagementSystem.get(hospitalName);
            hospitalManagementSystem.put(hospitalName, patientArrayList1);
            System.out.println(hospitalName + " Created successfully");
            System.out.println("New patient added to the " + hospitalName);
        }
    }

    public void showPatient() {

        if(patientArrayList.size() > 0) {
            for (int i = 0; i < patientArrayList.size(); i++) {
                System.out.println("\n"+patientArrayList);
                break;
            }
        }
        else
            System.out.println("No more Patients !");
    }
}
