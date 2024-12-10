package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RevString {
    public static void main(String[] arg) {
        String name = "", myName = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        name = sc.nextLine();


        for (int i = name.length() - 1; i >= 0; i--) {
            if(name.charAt(i) == '_'){

            }
            myName += name.charAt(i);
        }
            System.out.println("Reversed string: " + myName);
    }
            }