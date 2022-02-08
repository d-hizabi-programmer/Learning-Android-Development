package com.example.javaoops;

public class Student extends Person {
public int studentID;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    Student(int age, String first_name, String last_name, int studentID){
        setAge(age);
        setFirst_name(first_name);
        setLast_name(last_name);
        setStudentID(studentID);
    }
}

