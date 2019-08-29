package com.sda.marius.advanced;

import com.sda.marius.advanced.recapitulare.Gender;

import java.util.*;

public class colectionMain {
    public static void main(String[] args) {

        Profesor profesor=new Profesor(40,"Vasile", Gender.MALE,2000,"mate");
        Profesor profesor1=new Profesor(45,"Ioana",Gender.FEMALE,3000,"istorie");
        Profesor profesor2=new Profesor(50,"Paul",Gender.MALE,5000,"info");

        List<Profesor> prof = new ArrayList<>();
        prof.add(profesor);
        prof.add(profesor1);
        prof.add(profesor2);
        System.out.println(prof.get(prof.size()-1));

  //      Set<Profesor> proff = new HashSet<>(prof);
        //      face la fel ca si proff.add
//        proff.add(profesor);
//        proff.add(profesor1);
//        proff.add(profesor2);
    //    System.out.println(proff);
        Map<String, Profesor>profesorMap=new HashMap<>();
        profesorMap.put("CJ",profesor);
        profesorMap.put("SM",profesor1);
        profesorMap.put("BM",profesor2);
        profesorMap.get("CJ");//citeste elementul dupa keye
      //  System.out.println(profesorMap);
        //daca nu stiu keya folosesc Entry
        for (Map.Entry<String,Profesor> entry : profesorMap.entrySet()){
            System.out.println( entry.getValue());;
            System.out.println(entry.getKey());
        }


    }
}
