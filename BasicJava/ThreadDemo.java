package BasicJava;

class TA extends Thread{

    public void show() throws InterruptedException {
        for(int i=0; i<100;i++){
            Thread.sleep(10);
            System.out.println("Hi");
        }
    }

    @Override
    public void run() {
        try {
            show();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TB extends Thread{

    public void show() throws InterruptedException {
        for(int i=0; i<100;i++){
            Thread.sleep(10);
            System.out.println("Hello");
        }
    }
    public void run(){
        try {
            show();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        TA ta =  new TA();
        ta.start();

        TB tb =  new TB();
        tb.start();

        try {

            // we are asking main thread to wait until these 2 new thread complete their work and join
            ta.join();
            tb.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye..");  // if we dont join() , then this line will be executed somewhere in middle,
        // main thread won't wait for other threads to complete execution
    }
}
