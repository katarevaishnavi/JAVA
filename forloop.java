package com.vaishnavi;
import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        syntax for 'forloop'
        for(initialization;condition;increment/decrement){
        body
        }
        */

        //Q1. print numbers 1 to 5
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        //Q2. print numbers 1 to n
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(i);
        }

    }
}
