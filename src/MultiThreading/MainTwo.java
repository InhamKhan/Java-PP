package MultiThreading;

public class MainTwo implements Runnable{

    public static void main(String[] args) {
        MainTwo mt2 = new MainTwo();
        Thread t1 = new Thread(mt2);
        t1.start();
        System.out.println("The code is outside of the Thread:..");
    }
    @Override
    public void run() {
        System.out.println("The code is running in a Thread........!!!");
    }

}
