package com.example.linh.nutritrak;

/**
 * Created by Duong D.T. Nguyen on 6/17/2017.
 */

public class NutritionFact {
    private String name;
    private double fat,cho,sod,pot,car,pro;

    public NutritionFact(String name,double fat,double cho, double sod, double pot, double car, double pro){
        this.name = name;
        this.fat = fat;
        this.cho = cho;
        this.sod = sod;
        this.pot = pot;
        this.car = car;
        this.pro = pro;
    }

    public String getFat(){
        return String.valueOf(this.fat);
    }
    public String getCho(){
        return String.valueOf(this.cho);
    }
    public String getSod(){
        return String.valueOf(this.sod);
    }
    public String getPot(){
        return String.valueOf(this.pot);
    }
    public String getCar(){
        return String.valueOf(this.car);
    }
    public String getPro(){
        return String.valueOf(this.pro);
    }
}
