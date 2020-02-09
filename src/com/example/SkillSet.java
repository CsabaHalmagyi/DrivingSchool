package com.example;

public class SkillSet {

    private int turnLeft;
    private int turnRight;
    private int parking;
    private int changeGear;


    public SkillSet() {
        this.turnLeft = 0;
        this.turnRight = 0;
        this.parking = 0;
        this.changeGear = 0;

    }

    public void increaseSkill(String skillName, int value){

        if(skillName.equals("turnLeft")){
            this.turnLeft = this.turnLeft + value;
        }
        else if(skillName.equals("turnRight")){
            this.turnRight = this.turnRight + value;
        }
        else if(skillName.equals("parking")){
            this.parking = this.parking + value;
        }
        else if(skillName.equals("changeGear")){
            this.changeGear = this.changeGear + value;
        }
    }
    //returns true if all four skills are at 100%
    //returns false otherwise
    public boolean isAllSkillsAtHundred(){

        if(turnLeft>=100 && turnRight>=100 && parking >= 100 && changeGear >= 100){
            return true;
        }

        return false;
    }


    public int getTurnLeft() {
        return turnLeft;
    }

    public void setTurnLeft(int turnLeft) {
        this.turnLeft = turnLeft;
    }

    public int getTurnRight() {
        return turnRight;
    }

    public void setTurnRight(int turnRight) {
        this.turnRight = turnRight;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    public int getChangeGear() {
        return changeGear;
    }

    public void setChangeGear(int changeGear) {
        this.changeGear = changeGear;
    }


}
