package com.appslab;

public class StringCheck {

    public void checkString(String a, String b){


        if(a.charAt(a.length() - 1) == b.charAt(b.length() - 1))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
