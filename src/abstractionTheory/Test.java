package abstractionTheory;

public class Test {

    public static void main(String[] arg){

        //Reference of abstract Class only didn't make an object

        Dog dog = new Dog();
        System.out.print("the sound of Dog... ");
      dog.sayHello();


        Animal cat = new Cat();
        System.out.print("the sound of Cat.... ");
        cat.sayHello();
    }
}
