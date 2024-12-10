package workPractice;

public class Child extends Human {

    String childName;

    public Child(String firstName, String lastName, double age, int cnic, String childName) {
        super(firstName, lastName, age, cnic);
        this.childName = childName;
    }
    public void checking(){
        System.out.println("Checking the age of child....");
    }
    public void getHumanInfo(){
        System.out.println("Get the Name of child: " + childName);
    }

}
