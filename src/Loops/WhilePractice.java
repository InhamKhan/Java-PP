package Loops;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] arg) {
//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            i++;
//        }
//    }
//}
        Scanner sc = new Scanner(System.in);
        boolean hashLearn = false;
        while(!hashLearn){
            System.out.println("went to a school, tried to learn");
            System.out.println("Have you underStood?");
            hashLearn = sc.nextBoolean();
        }
    }
}