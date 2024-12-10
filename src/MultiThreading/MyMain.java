package MultiThreading;

public class MyMain extends Thread {

    public static int amount = 4;

    public static void main(String[] args) {
        MyMain thread = new MyMain();
        thread.start();

        while(thread.isAlive()){
            System.out.println("waiting.....");
        }
        System.out.println("Main : " + amount);
        amount++;
        System.out.println("Main01 : " + amount);
    }
    public void run(){
        amount++;
    }


    //Example01.
//    public static int amount = 10;
//
//    public static void main(String[] args) {
//            MyMain thread = new MyMain();
//            thread.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//    }
//    public void run(){
//        amount++;
//    }
//
//}
}