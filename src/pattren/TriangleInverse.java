package pattren;

public class TriangleInverse {
    public static void main(String[] arg){

        for (int k = 0; k <= 7; k++){
            for (int g = 0; g < k; g++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 7; i >= 0; i--){
            for(int j = 0; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
