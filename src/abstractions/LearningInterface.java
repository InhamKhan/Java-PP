package abstractions;

public class LearningInterface {
//    Animal a1 = new Animal();

    public static void main(String[] args) {
         Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
        monkey.hunting();
//     Animal.LEGS = 4;
monkey.walks();

        System.out.println(Animal.LEGS);
    }
}
interface Pet{
    void sings();
    void drinks();
    void hunting();
}
interface Animal{

    int LEGS = 4;
   void eats();
   void drinks();
   void hunting();
   default void walks(){
       System.out.println("Animal is walking");
   }

}
class Monkey implements Animal, Pet{


    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is Drinking");
    }

    @Override
    public void hunting() {
        System.out.println("Monkey is hunting");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }
}