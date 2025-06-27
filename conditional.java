package com.vaishnavi;
import java.net.SocketOption;
import java.util.*;
public class conditional {
    public static void main (String[] args) {
        //if else statements
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age?");
        int age = sc.nextInt();

        if (age>20){
            System.out.println("you are allowed");
        }
        else if (age>70){
            System.out.println("you are not allowed");
        }
        else{
            System.out.println("sorry! age limit is atleast 20");
        }
    }
}
