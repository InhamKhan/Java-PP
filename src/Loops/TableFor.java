package Loops;

import java.util.Scanner;

public class TableFor {

     public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number = sc.nextInt();

//         for (int i = 1; i < 11; i++)
        /* for(int i = 0; i <= 10; i++){
             System.out.println(number+" * " +i+" = "+ i*number);
         }*/
         int sum = 0;
         for(int i = 1; i <= number; i++){
//             sum = sum + 2*i;
             sum = sum + 2*i;
         }
         System.out.println("Sum is:" +sum);
    }
}
