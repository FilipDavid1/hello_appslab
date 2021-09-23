package com.appslab;

import java.util.Arrays;

public class NumberWar {

    public void warOfNumbers(int[] numbers){

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++){
            if (i % 2 == 0)
                evenSum += numbers[i];
            else
                oddSum += numbers[i];
        }

        if (evenSum > oddSum)
            System.out.println(evenSum - oddSum);
        else
            System.out.println(oddSum - evenSum);

    }

}
