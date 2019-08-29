package com.sda.marius.advanced;

import com.sda.marius.advanced.recapitulare.Gender;
import com.sda.marius.advanced.recapitulare.Payable;
import com.sda.marius.advanced.recapitulare.Person;

public class Profesor extends Person  implements Payable {

    private double salary;
    private String subject;
//subject =materia
    public Profesor() {
    }

    public Profesor(double salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    public Profesor(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void pay(double amount) {
       // salary=amount;
        this.salary=amount;
    }
}
