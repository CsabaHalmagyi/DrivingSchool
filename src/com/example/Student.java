package com.example;

import java.util.Random;

public class Student {

    private String name;
    private int hoursPracticed;
    private SkillSet skillset;

    public Student(String name) {
        this.name = name;
        this.hoursPracticed = 0;
        this.skillset = new SkillSet();
    }

    public boolean isReadyForExam(){
        return skillset.isAllSkillsAtHundred();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPracticed() {
        return hoursPracticed;
    }

    public void setHoursPracticed(int hoursPracticed) {
        this.hoursPracticed = hoursPracticed;
    }

    public SkillSet getSkillset() {
        return skillset;
    }

    public void setSkillset(SkillSet skillset) {
        this.skillset = skillset;
    }


    public void practice(int hour){

        Random random = new Random();
        //after every hour increase all skills by 0-10%
        for(int i=0;i<hour;i++){
            skillset.increaseSkill("turnLeft", random.nextInt(11));
            skillset.increaseSkill("turnRight", random.nextInt(11));
            skillset.increaseSkill("parking", random.nextInt(11));
            skillset.increaseSkill("changeGear", random.nextInt(11));
        }
    }

    public void printSkillSet(){

        System.out.println("Student "+ name + " currently has the following skills:");
        System.out.println("Turn left skill: "+ skillset.getTurnLeft());
        System.out.println("Turn right skill: "+ skillset.getTurnRight());
        System.out.println("Parking skill: "+ skillset.getParking());
        System.out.println("Changing gear skill: "+ skillset.getChangeGear());
    }
}
