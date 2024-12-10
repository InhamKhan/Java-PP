package abstractions;

public class LearningInnerClass {

    class Toy{

        int price;
    }
    static class Playstation{
        int price;
    }

    public static void main(String[] arg){
        LearningInnerClass obj = new LearningInnerClass() ;
        Toy toy =obj.new Toy();
        toy.price = 45;

        Playstation playstation = new LearningInnerClass.Playstation();
    }
}
