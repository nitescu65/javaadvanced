package com.sda.marius.advanced;

import com.sda.marius.advanced.recapitulare.Gender;
import com.sda.marius.advanced.recapitulare.Person;
import com.sda.marius.advanced.recapitulare.Student;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(22, "Didi", Gender.FEMALE);
        Person person2 = new Person();
        Profesor profesor=new Profesor(100,"mate");
        List<Integer>studentGrades=new ArrayList<>();
        studentGrades.add(7);
        studentGrades.add(9);
        studentGrades.add(10);

        Student student =new Student(18,"Ion",Gender.MALE,studentGrades );
        Director director=new Director(55,"Vasile",Gender.MALE,0,"fizica");
        Profesor prof =new Profesor(51,"Gheorghe",Gender.MALE,0,"Informatica");

        prof.pay(1000);
        director.pay(2000);
        System.out.println(student);
        System.out.println(director.getSalary());
        System.out.println(prof);


//        person2.setAge(22);
//        person2.setName("Didi");
//        person2.setGender(Gender.FEMALE);
//
//        System.out.println("Person2 : " + person2);
//        System.out.println("Person  : " + person);
//
//        if (person.equals(person2)) {
//            System.out.println("Are equal");
//        } else {
//            System.out.println("Not equal");
//        }

    }
}
