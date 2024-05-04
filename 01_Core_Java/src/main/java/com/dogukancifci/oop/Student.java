package com.dogukancifci.oop;

import java.util.Date;

public class Student {
    //variables
    private Long id;
    private String studentName;
    private String studentSurname;

    //Constructor (parameter)
    public Student(Long id, String studentName, String studentSurname) {
        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    //Constructor
    public Student() {

    }

    //String
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                '}';
    }

    public String fullName(String studentName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id).append(" ").append(studentName).append(" ").append(this.studentSurname);
        String change = stringBuilder.toString();
        return change;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

}

