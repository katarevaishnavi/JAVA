package com.vaishnavi;
import java.util.*;
public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=sc.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("The character is in lowercase");
        }
        else{
            System.out.println("The character is in UPPERCASE");
        }
    }
}
