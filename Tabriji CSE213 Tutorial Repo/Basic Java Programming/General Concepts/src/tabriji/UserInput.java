package tabriji;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input_nibe_j = new Scanner(System.in); //initialization

        System.out.print("Enter a number: ");
        int a = input_nibe_j.nextInt();
        System.out.print("Enter another number: ");
        int b = input_nibe_j.nextInt();

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}
