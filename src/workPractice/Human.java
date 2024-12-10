package workPractice;

public class Human {

    String firstName;
    String lastName;
    double age;
    int cnic;

    public Human(String firstName, String lastName, double age, int cnic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cnic = cnic;
    }
    public void getHumanInfo(){
        System.out.println("firstName : " + firstName + "lastName : " + lastName + " Age : " + age + " CNIC : " + cnic );
    }


}
