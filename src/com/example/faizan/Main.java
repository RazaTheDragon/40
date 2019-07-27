package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner number = new Scanner(System.in);
        int x, y, z;
        System.out.println("First number :");
        x = number.nextInt();
        System.out.println("Second number :");
        y = number.nextInt();
        if (y < 15000 & x < 15000 ) {
            z = x + y;
//---------------------------------------------------------------------------------------Five digits-------
            if (z > 9999) {
                System.out.println(" ");
                System.out.println("Sum of above given number in vertical order is :");

                int a = z / 10000;
                System.out.println(a);
                int b = z - (a * 10000);
                b = b / 1000;
                System.out.println(b);
                int c = z - ((a * 10000) + (b * 1000));
                c = c / 100;
                System.out.println(c);
                int d = z - ((a * 10000) + (b * 1000) + (c * 100));
                d = d / 10;
                System.out.println(d);
                int e = z - ((a * 10000) + (b * 1000) + (c * 100) + (d * 10));
                System.out.println(e);

            }
//---------------------------------------------------------------------------------------Four digits-------
            else if (z > 999) {
                System.out.println(" ");
                System.out.println("Sum of above given number in vertical order is :");

                int b = z / 1000;
                System.out.println(b);
                int c = z - (b * 1000);
                c = c / 100;
                System.out.println(c);
                int d = z - ((b * 1000) + (c * 100));
                d = d / 10;
                System.out.println(d);
                int e = z - ((b * 1000) + (c * 100) + (d * 10));
                System.out.println(e);
            }
//--------------------------------------------------------------------------------------Three digits-------
            else if (z > 99) {
                System.out.println(" ");
                System.out.println("Sum of above given number in vertical order is :");

                int c = z / 100;
                System.out.println(c);
                int d = z - (c * 100);
                d = d / 10;
                System.out.println(d);
                int e = z - ((c * 100) + (d * 10));
                System.out.println(e);
            }
//----------------------------------------------------------------------------------------Two digits-------
            else if (z > 9) {
                System.out.println(" ");
                System.out.println("Sum of above given number in vertical order is :");

                int d = z / 10;
                System.out.println(d);
                int e = z - (d * 10);
                System.out.println(e);
            }
//----------------------------------------------------------------------------------------One digits-------
            else {
                System.out.println(z);
            }


        } else{
            System.out.println(" \n"+
                    "Error : Any one of the given number or both are out of rang which is 1 to 15000.");}
    }
}
