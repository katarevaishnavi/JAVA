package com.vaishnavi;
import java.util.*;
public class dowhileloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int num=sc.nextInt();
        /*
        syntax of 'do while loop'
        initalization;
        do {
        body}
        while(condition);
        */
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i!=num);

    }
}
