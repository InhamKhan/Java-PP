package Loops;

/*At one time the execution must take place in do while
* in while first check the condition then process it but in do while first it goes to
* execute the statement than check the condition
* */


public class DoWhile {
    public static void main(String[] args){

        int i = 8;
        do{
            System.out.println(i);
            i++;
        }while(i <= 5);
        System.out.println("out of the loop");
    }
}
