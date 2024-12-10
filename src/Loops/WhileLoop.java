package Loops;
/*
 * Repeats a statement or group of statements while a given condition is true.
 * It tests the condition before executing the loop body.
 */

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] arg) {
        String name = "", myName = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        name = sc.nextLine();

        while (!name.isEmpty()) {
            myName = "";

            for (int i = name.length() - 1; i >= 0; i--) {
                if (name.charAt(i) == '_') {
                    // Skip the underscore
                }
                myName += name.charAt(i);
            }
            System.out.println("Reversed string: " + myName);

            System.out.print("Enter a string: ");
            name = sc.nextLine();
        }
    }
}
