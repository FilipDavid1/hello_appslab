package com.appslab;

public class Slice {
    public boolean equalSlices(int Slices, int People, int SliceForOne){

        int Multiplier = People * SliceForOne;

        boolean x;

        if(Multiplier <= Slices){
            x = true;
        }
        else x = People == 0;

        return x;
    }
}
