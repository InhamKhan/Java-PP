package pattren;

public class HollowRectAngle {
    public static void main(String[] arg){

        int k = 4;
        int l = 5;

        for (int i = 1; i <= k; i++) {

            for (int j = 1; j <= l; j++) {
                //cell ->(i,j)
                if(i == 1 || j == 1 || i == k || j == l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
