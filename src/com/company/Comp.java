package com.company;

import java.util.Scanner;

public class Comp {
    public static void main(String args[]){
        Scanner prnt = new Scanner(System.in);
        int num1 , num2, num3;
        System.out.print("Enter num1:");
        num1 = prnt.nextInt();
        System.out.print("Enter num2:");
        num2 = prnt.nextInt();
        System.out.print("Enter num3:");
        num3 = prnt.nextInt();
        if(num1==num2 && num2==num3) {
            System.out.println("all numbers are equal");
        }
        else if(num1<num2 && num1<num3){
            System.out.println(num1 + " is smallest");
        } else if (num2<num3) {
            System.out.println(num2 + " is smallest");
        }
        else {
            System.out.println(num3 + " is smallest");
        }

    }
}
