package BasicJava;


class RunDemoA{
// just for demonstrating we can extend form other class and have thread class
// this is possible due to Runnable interface, would not be possible with Thread class
}

class RunDemoB extends RunDemoA implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Hii..");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runDemoB =  new RunDemoB();

//        runDemoB.start(); // Runnable interface dont have start()

        Thread t1 = new Thread(runDemoB); // we need to create Thread object
        t1.start();

    }
}
