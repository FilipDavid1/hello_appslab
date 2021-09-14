package com.appslab;

public class Snail {
    public double totalDistance(double stepLength, double stepHeight, double towerHeight) {

        if (stepLength < 0) {
            throw new IllegalArgumentException("enter bigger number");
        } else if (stepHeight < 0) {
            throw new IllegalArgumentException("enter bigger number");
        } else if (towerHeight < 0) {
            throw new IllegalArgumentException("enter bigger number");
        } else {


            double divisor = stepLength + stepHeight;


            return (towerHeight / stepLength) * divisor;
        }
    }
}
