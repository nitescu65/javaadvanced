package com.sda.marius.advanced.recapitulare;

import sun.awt.image.ImageWatched;

import java.util.List;
//grades = note;
public class Student extends Person {

   private List<Integer > grades;

    public Student() {

    }

    public Student(List<Integer> grades) {
        this.grades = grades;
    }

    public Student(int age, String name, Gender gender, List<Integer> grades) {
        super(age, name, gender);
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student: " +
                "grades = " + grades;
    }
}
