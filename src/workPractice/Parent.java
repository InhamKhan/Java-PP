package workPractice;

public class Parent extends Human{

    String parentName;

    public Parent(String firstName, String lastName, double age, int cnic, String parentName) {
        super(firstName, lastName, age, cnic);
        this.parentName = parentName;
    }
  public void getParentDetails(){
      System.out.println("Checking the Name of the parent : " + parentName);
  }
  public void getHumanInfo(){
      System.out.println("To get the info of Human : " + parentName);
  }
}
