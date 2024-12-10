package strings;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class ExampleOne {
    public static void main(String[] arg){
//Stack memory (all the reference are in Stack memory. like scanner class "sc" is referencing to an object class
        //Heap memory mean that our actual object will go inside the memory (new Scanner)
        //String Constant pool.inHeap memory.
      //  String name = new String("Inham");
       //literal way of Strings

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first Name");
        String firstName = sc.nextLine();

        System.out.println("Enter your last Name");
        String lastName = sc.nextLine();
        String result =  firstName + lastName;
        System.out.println("Full Name :" + result.charAt(6));
    }
}
