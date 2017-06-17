package com.example.linh.nutritrak;

/**
 * Created by Duong D.T. Nguyen on 6/17/2017.
 */

public class NutritionFact {
    private String name;
    private float fat,cho,sod,pot,car,pro;

    public NutritionFact(String name,float fat,float cho, float sod, float pot, float car, float pro){
        this.name = name;
        this.fat = fat;
        this.cho = cho;
        this.sod = sod;
        this.pot = pot;
        this.car = car;
        this.pro = pro;
    }

}
