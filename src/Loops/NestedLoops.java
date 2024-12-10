package Loops;

public class NestedLoops {

    public static void main(String[] arg) {
//this work should be done bye 10 time..?
/*
        for (int count = 0; count < 10; count++) {

        for (int i = 0; i < 6; i++) {
            System.out.print(i+" ");
        }
            System.out.println(count+ "printed");
            }
 */
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}