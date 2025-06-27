package com.vaishnavi;
import java.util.*;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        System.out.println("Enter a number");
        int c = sc.nextInt();

        int max=a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        System.out.println("The Largest number is :"+max);
    }
}
