package tabriji;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initialization

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
// single line comment
    /*
        multi
                line
                        comment
                                */
        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}
