package com.example.inclassassignment06_yuqingw;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String legs;
    private Boolean hasFur;
    private String information;


    public Animal(String name,String legs,Boolean hasFur,String information){
        this.name = name;
        this.legs = legs;
        this.hasFur = hasFur;
        this.information = information;
    }

    public String getName(){
        return name;
    }

    public String getLegs(){
        return legs;
    }

    public Boolean getHasFur(){
        return hasFur;
    }

    public String getInformation(){
        return  information;
    }
}
