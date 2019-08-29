package com.sda.marius.advanced;

import com.sda.marius.advanced.recapitulare.Gender;
import com.sda.marius.advanced.recapitulare.Payable;

public class Director extends Profesor  {

    public Director() {
    }

    public Director(double salary, String subject) {
        super(salary, subject);
    }

    public Director(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender, salary, subject);
    }

    public void pay(double amount){
        super.setSalary(amount*2);
  }

}
