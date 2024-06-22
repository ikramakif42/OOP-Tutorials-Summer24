package com.tabriji.generalProgramming;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input_taker = new Scanner(System.in);

        int a, b;

        System.out.print("Please enter a number: ");
        a = input_taker.nextInt();
        System.out.print("Please enter another number: ");
        b = input_taker.nextInt();

        int sum = a + b;
        double test_sum = a + b;
        System.out.println("The sum is: " + sum);
        System.out.println("The test_sum is: " + test_sum);
    }
}
