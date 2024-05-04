package com.dogukancifci.oop;

import java.util.Date;

public class Teacher {
    //variables
    private Long id;
    private String teacherName;
    private String teacherSurname;
    private Date createDate;

    //Constructor (parameter)
    public Teacher(Long id, String teacherName, String teacherSurname, Date createDate) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;

    }

    //Constructor
    public Teacher() {
        id=0L;
        this.teacherName="Adınızı girmediniz";
        this.teacherSurname="Soydınızı girmediniz";
        createDate=new Date(System.currentTimeMillis());
    }

    //String


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String fullName(String teacherName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id).append(" ").append(teacherName).append(" ").append(this.teacherSurname);
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

