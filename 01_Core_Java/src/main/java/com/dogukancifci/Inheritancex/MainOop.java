package com.dogukancifci.Inheritancex;

public class MainOop {
    public static void main(String[] args) {

        // Person
        Person person= new Person();
        person.setId(1L);
        person.setName("DogukanPerson");
        person.setSurname("CifciPerson");
        System.out.println(person);


        System.out.println("******************");
        // Student
        Student student= new Student();
        student.setId(1L);
        student.setName("Dogukan");
        student.setSurname("Cifci");
        System.out.println(student);


        System.out.println("******************");
        Teacher teacher= new Teacher();
        teacher.setId(1L);
        teacher.setName("Dogukan2");
        teacher.setSurname("Cifci2");
        System.out.println(teacher);


    }
}