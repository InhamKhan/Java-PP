package Loops;

public class BreakAndContinue {

    public static void main(String[] arg) {

        for (int i = 0; i <= 20; i++) {

            if (i == 2 || i == 10 ) continue;
            if (i >= 15) break;
//            else if (i >15) {
//                break;
//
//            }
            System.out.println("assigned the work " +i);

        }
    }
}