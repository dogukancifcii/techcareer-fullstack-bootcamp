package com.dogukancifci.oop;

public class MainOop {
    public static void main(String[] args) {
        // Student
        Student student= new Student();
        student.setId(1L);
        student.setStudentName("Dogukan");
        student.setStudentSurname("Cifci");
        System.out.println(student);
        String data= student.fullName("Dogukan");
        System.out.println(data);
        System.out.println();
        //Teacher
        Teacher teacher= new Teacher();
        teacher.setId(1L);
        teacher.setTeacherName("Dogukan2");
        teacher.setTeacherSurname("Cifci2");
        System.out.println(teacher);
        String data2= teacher.fullName("Dogukan");
        System.out.println(data2);
    }
}
