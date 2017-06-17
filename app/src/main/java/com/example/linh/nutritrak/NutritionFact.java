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
        return String.format("%3.2f",this.fat);
    }
    public String getCho(){
        return String.format("%3.2f",this.cho);
    }
    public String getSod(){
        return String.format("%3.2f",this.sod);
    }
    public String getPot(){
        return String.format("%3.2f",this.pot);
    }
    public String getCar(){
        return String.format("%3.2f",this.car);
    }
    public String getPro(){
        return String.format("%3.2f",this.pro);
    }
}
