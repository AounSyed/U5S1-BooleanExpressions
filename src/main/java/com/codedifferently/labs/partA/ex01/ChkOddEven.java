package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(){
        String response = "";
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        if (num % 2 == 1)
        {
            response += "The number " + num + " is odd.";
        }
        if (num % 2 == 0)
        {
            response += "The number " + num + " is even.";
        }
        return response;
    }
    public static void main(String args[]) {

        String oddEven = oddEven();
        System.out.println(oddEven);

    }
}
