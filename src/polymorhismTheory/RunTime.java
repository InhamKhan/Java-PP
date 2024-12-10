package polymorhismTheory;

public class RunTime {
    void display(){
        System.out.println("This time only display the runTime");
    }

    public static class Child extends RunTime{
        @Override
        void display(){
            System.out.println("This time display the method only the Child....");
        }
    }

    public static void main(String[] args) {
        RunTime obj = new Child();
        obj.display();
    }
}
