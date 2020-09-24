package com.company;

public class Patient {
    private String name;
    private String sickness;
    boolean isSick = false;

    //Constructor 1
    public Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    public Patient(String name) {
        this.name = name;
    }

    //Method 1
    public String getName() {
        return name;
    }
    //Method 2
    public String getSickness(){
        return sickness;
    }
    //Method 3
    public void takeMedication(Medicine medicine){
        if (medicine.getTreatmentName().equals(this.sickness)) {
            this.sickness = null;
        }
    }
    //Method 4
    public boolean isSick() {
        if (sickness == null) {
            isSick = false;}
        else {
            isSick = true;
        }
        return isSick;
    }
}

