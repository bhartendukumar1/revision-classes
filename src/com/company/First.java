package com.company;

import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);// craete an object of scanner class for using its feature(user_input)
        System.out.println("enter first number");

        int num1 = obj.nextInt();
        System.out.println("enter 2nd number:");
        int num2 =  obj.nextInt();
        System.out.println("enter 3rd number");
        int num3 = obj.nextInt();

        System.out.print("average = ");
        float avg = (num1 +num2 + num3)/3;

        System.out.print(avg);
    }

}
