package com.codedifferently.labs.partA.ex02;

public class AgeCheck {
    public static String age(){
        String response= "";

        int myAge = 15;   // I am 19; let me see if I can drive yet

        if (myAge >= 16) {
            response += ("I'm old enough to have a driver's license!");
        }
        else {
            response += ("I'm not old enough yet... :*(");
        }


        return response;
    }
    public static void main(String[] args) {
        String ageOutput = age();
        System.out.println(ageOutput);
    }
}
