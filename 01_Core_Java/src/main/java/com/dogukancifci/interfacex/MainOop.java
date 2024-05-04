package com.dogukancifci.interfacex;

import java.util.UUID;

public class MainOop {
    public static void main(String[] args) {

        // Polymorphism
        Person person= new Student(); //Polymorhism
        person.setId(1L);
        person.setName("DogukanPerson");
        person.setSurname("CifciPerson");
        System.out.println(person);


        System.out.println("/////////////////////////");
        // Student
        Student student= new Student();
        student.setId(1L);
        student.setName("Dogukan");
        student.setSurname("Cifci");
        student.govdesizMethod(); //Polymorhism
        student.setSpecialStudent("Kart ID: "+ UUID.randomUUID().toString());
        System.out.println(student.getSpecialStudent());
        System.out.println(student);


        System.out.println("/////////////////////////");
        Teacher teacher= new Teacher();
        teacher.setId(1L);
        teacher.setName("Dogukan2");
        teacher.setSurname("Cifci2");
        teacher.govdesizMethod();//Polymorhism
        System.out.println(teacher);


    }
}