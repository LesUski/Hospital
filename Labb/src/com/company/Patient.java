package com.company;

public class Patient {
    private String name;
    private String sickness;
    private boolean isSick = false;

    //Constructor 1
    public Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    public Patient(String name) {
        this.name = name;
    }

    //Method 1
    protected String getName() {
        return name;
    }
    //Method 2
    protected String getSickness(){
        return sickness;
    }
    //Method 3
    protected void takeMedication(Medicine medicine){
        if (medicine.getTreatmentName().equals(this.sickness)) {
            this.sickness = null;
        }
    }
    //Method 4
    protected boolean isSick() {
        isSick = sickness != null;
        return isSick;
    }
}

