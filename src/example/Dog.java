package example;

public class Dog extends Animal{
    public static void main(String[] arg) {
        String makeSound = "";
        System.out.println("The sound of the Dog is:" + makeSound);
    }
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
