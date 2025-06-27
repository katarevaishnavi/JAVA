package com.vaishnavi;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int a =0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println("the Fibonacci of the entered number is:"+b);
    }
}
