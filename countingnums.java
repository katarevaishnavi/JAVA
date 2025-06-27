package com.vaishnavi;
import java.util.*;
public class countingnums {
    public static void main(String[] args) {
        int n=575907;
        int count =0;
        while(n>0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("the number of time 7 is repeated:"+count);

    }
}
