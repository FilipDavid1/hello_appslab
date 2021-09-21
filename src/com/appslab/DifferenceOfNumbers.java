package com.appslab;
import java.util.Arrays;

public class DifferenceOfNumbers {


    public int differenceMaxMin(int[] numbers){
        Arrays.sort(numbers);

        int first = numbers[0];
        int last = numbers[numbers.length -1];



            return Math.abs(first - last);



    }
}
