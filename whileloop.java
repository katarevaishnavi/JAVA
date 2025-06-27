package com.vaishnavi;
import java.util.*;
public class whileloop {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        /*
        syntax for 'while loop'
         initalization
         while(condition){
            body + incre/dec
            }
         */
        System.out.println("Enter the value:");
        int num= sc.nextInt();

        //Q1. print numbers 1 to n
        int i = 1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
