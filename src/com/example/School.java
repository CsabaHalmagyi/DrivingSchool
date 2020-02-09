package com.example;

import java.util.List;

public class School {

    List<Student> studentList;
    List<Car> carList;

    public School(List<Student> studentList, List<Car> carList) {
        this.studentList = studentList;
        this.carList = carList;
    }

    public School() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }



    public void practiceDriving(Student student, Car car, int numberOfHours){
        //make the student practice X hours
        student.practice(numberOfHours);

        //increase the KMs in the car
        //TODO: for every number of hours increase the KM by a small random amount (0-15)
        //Check how you can generate random numbers in student.practice()
        car.addKMs(10);

    }


}
