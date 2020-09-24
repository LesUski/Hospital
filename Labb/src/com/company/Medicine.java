package com.company;

class Medicine {
    public String treatsSickness;       //field

    public Medicine(String sickness) {  //constructor
        this.treatsSickness = sickness;
    }

    public String getTreatmentName() {  //method
        return treatsSickness;
    }
}