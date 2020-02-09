package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        School school = new School();

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Car volvo = new Car("Volvo", 15000);


        alice.printSkillSet();
        school.practiceDriving(alice, volvo, 20);
        System.out.println("After practicing for 2 hours: ");
        alice.printSkillSet();
    }
}
