package oopsLearning01;



public class Student {
public static void main(String[] arg){
    Student st1;
    //object ko banayain gay, ya st1 aik container ha jo k
    st1 = new Student();

    st1.studentName="Adnan";
    st1.studentId = 123;
    st1.studentCity = "Islamabad";

    st1.study();
    st1.showFullDetails();

    Student st2 = new Student();

    st2.studentId = 99;
    st2.studentName = "Hassan Ahmed";
    st2.studentCity = "Abbottabad";

    st2.study();
    st2.showFullDetails();
    System.out.println();
}
    private int studentId;
    private String studentName;
    private String studentCity;

    public  void study(){
        System.out.println(studentName + " is studying" );
        }
    public void showFullDetails(){
        System.out.println("My name is " + studentName);
        System.out.println("My ID is " + studentId);
        System.out.println("My city is " + studentCity);
    }
}