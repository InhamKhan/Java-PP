package abstractions;

//a class contain another class known as nested class.it is possible to create a nested class without giving ab name
//a nested class that doesn't have any name known as an anonymous class
public class LearnAnonymous {
}
class InnerClass extends OuterClass{

    OuterClass obj = new OuterClass() {
        void sing() {
        }
    };

    SuperInterface obj2 = new  SuperInterface(){
@Override
        public void interfaceMethod(){

}
    };

    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args){

        WalkAble walkAble = (int steps) -> {
            System.out.println("Walked " +steps+ "steps");
            return  steps;
        };

        // WalkAble.walks(5);
        WalkAble obj2 = (int steps) -> 2*steps;

        System.out.println(obj2.walks(8));

    }
    }
interface WalkAble{
    int walks(int steps);

}
class OuterClass{

    public void outerMethod(){

    }
};

@FunctionalInterface
interface SuperInterface{
        void interfaceMethod();
    }
