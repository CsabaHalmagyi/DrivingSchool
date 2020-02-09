package com.example;

public class Car {

    private String make;
    private int km;

    public Car(String make, int km) {
        this.make = make;
        this.km = km;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    //increases the number of KMs in the car by x
    public void addKMs(int x){

    }


}
