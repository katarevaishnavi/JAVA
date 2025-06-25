package com.vaishnavi;
import java.util.*;
import java.util.Scanner;

public class input {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age?");
        int age = sc.nextInt();
        sc.nextLine(); // we added this as nextline just reads the prev int value and moves on without taking second input
        System.out.println("how are you feeling today?");
        String exp = sc.nextLine();
        System.out.println("Thank you! have a lovely day.");
    }
}
