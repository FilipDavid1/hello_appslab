package com.appslab;

public class Sides {
    public boolean isTriangle(double a, double b, double c){

        boolean x;

        if(a < b && b < c){
            x = true;
        }
        else if(a == b && b == c){
            x = true;
        }
        else {
            x = false;
        }

        return x;
    };
}
